package xsna;

import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Loader;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.offline.api.exception.KeyNotFoundHlsPlaybackException;
import com.vk.music.player.PlayState;
import com.vk.music.player.error.ErrorType;
import com.vk.music.player.error.VkPlayerException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.jza0;
import xsna.q850;
import xsna.u850;

/* compiled from: ExoPlayerHelper.java */
/* loaded from: classes7.dex */
public final class d6q implements jza0.b {
    public final /* synthetic */ c6q b;

    public d6q(c6q c6qVar) {
        this.b = c6qVar;
    }

    @Override // xsna.jza0.b
    public final void D(int i, jza0.c cVar, jza0.c cVar2) {
        bn40.b("reason=", Integer.valueOf(i));
    }

    @Override // xsna.jza0.b
    public final void N(dip0 dip0Var) {
        bn40.b("trackGroups=", dip0Var.a);
    }

    @Override // xsna.jza0.b
    public final void onLoadingChanged(boolean z) {
        bn40.f("isLoading=", Boolean.valueOf(z));
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        Exception runtimeException;
        evk evkVar;
        VkPlayerException unknownVkPlayerException;
        String str;
        int i;
        String obj;
        MusicTrack musicTrack;
        c6q c6qVar = this.b;
        if (playbackException == null) {
            bn40.d("error=null, url=", c6qVar.j, "refer=", MusicPlaybackLaunchContext.Mb(c6qVar.i));
            runtimeException = null;
        } else {
            String d = playbackException.d();
            bn40.c(playbackException, "code=", d, "url=", c6qVar.j, "refer=", MusicPlaybackLaunchContext.Mb(c6qVar.i));
            try {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    int i2 = exoPlaybackException.type;
                    if (i2 == 0) {
                        runtimeException = exoPlaybackException.g();
                    } else if (i2 == 1) {
                        fxc0.z(i2 == 1);
                        Throwable cause = exoPlaybackException.getCause();
                        cause.getClass();
                        runtimeException = (Exception) cause;
                    } else if (i2 != 2) {
                        runtimeException = new RuntimeException("Unknown underlying exception. type=" + exoPlaybackException.type);
                    } else {
                        fxc0.z(i2 == 2);
                        Throwable cause2 = exoPlaybackException.getCause();
                        cause2.getClass();
                        runtimeException = (RuntimeException) cause2;
                    }
                } else {
                    runtimeException = null;
                }
                if (runtimeException instanceof UnrecognizedInputFormatException) {
                    runtimeException = new Exception(runtimeException.getMessage() + "|uri=" + ((UnrecognizedInputFormatException) runtimeException).uri, runtimeException);
                }
                if ((runtimeException instanceof HttpDataSource$HttpDataSourceException) && (evkVar = ((HttpDataSource$HttpDataSourceException) runtimeException).dataSpec) != null) {
                    runtimeException = new Exception(runtimeException.getMessage() + "|code=" + d + "|uri=" + evkVar.a, runtimeException);
                }
            } catch (Exception e) {
                runtimeException = new RuntimeException(lhg.a(playbackException instanceof ExoPlaybackException ? ((ExoPlaybackException) playbackException).type : -1, "Failed to resolve underlying exception for type="), e);
            }
        }
        if (runtimeException != null) {
            com.vk.metrics.eventtracking.b.a.a(runtimeException);
            bn40.c(runtimeException, new Object[0]);
        }
        if ((playbackException instanceof ExoPlaybackException) && ((ExoPlaybackException) playbackException).type == 0 && (musicTrack = c6qVar.k) != null) {
            c6qVar.a.d(musicTrack, null);
        }
        r6m.a.getClass();
        if (r6m.j()) {
            c6qVar.k();
        } else {
            c6qVar.l = (int) ((androidx.media3.exoplayer.l) c6qVar.r.b()).getCurrentPosition();
            c6qVar.g = false;
        }
        if (c6qVar.b != null) {
            if ((playbackException.getCause() instanceof Loader.UnexpectedLoaderException) && (playbackException.getCause().getCause() instanceof KeyNotFoundHlsPlaybackException)) {
                unknownVkPlayerException = new VkPlayerException.OfflineKeysMissingVkPlayerException(playbackException);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException2 = (ExoPlaybackException) playbackException;
                    if (exoPlaybackException2.type == 0 && (exoPlaybackException2.g() instanceof HttpDataSource$InvalidResponseCodeException)) {
                        HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) exoPlaybackException2.g();
                        unknownVkPlayerException = new VkPlayerException.HttpDataSourceVkPlayerException(playbackException, httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.a);
                    }
                }
                unknownVkPlayerException = new VkPlayerException.UnknownVkPlayerException(playbackException);
            }
            q850 q850Var = c6qVar.b.a;
            ErrorType d2 = unknownVkPlayerException.d();
            if (d2 == null || (str = d2.toString()) == null) {
                str = "";
            }
            bn40.d(BatchApiRequest.FIELD_NAME_ON_ERROR, "errorType:", str);
            q850.a aVar = q850Var.f;
            ErrorType d3 = unknownVkPlayerException.d();
            bn40.d(BatchApiRequest.FIELD_NAME_ON_ERROR, "errorType:", (d3 == null || (obj = d3.toString()) == null) ? "" : obj, "retries", Integer.valueOf(q850Var.g), "Current params=", String.valueOf(aVar));
            if (aVar != null && aVar.d && (i = q850Var.g) < 3) {
                q850Var.g = i + 1;
                q850Var.q(aVar);
            } else {
                q850Var.stop(26);
                q850Var.h = true;
                q850Var.g = 0;
            }
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerStateChanged(boolean z, int i) {
        c6q c6qVar = this.b;
        androidx.media3.exoplayer.l a = c6qVar.a();
        bn40.f("playWhenReady=", Boolean.valueOf(z), "playbackState=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? lhg.a(i, "Unknown ") : "STATE_ENDED" : "STATE_READY" : "STATE_BUFFERING" : "STATE_IDLE", "player=", a);
        if (a == null) {
            return;
        }
        if (i == 4) {
            c6qVar.k();
            s850 s850Var = c6qVar.b;
            if (s850Var != null) {
                bn40.f("onCompleted");
                q850 q850Var = s850Var.a;
                q850.a aVar = q850Var.f;
                if (aVar == null || !aVar.d) {
                    q850Var.stop(26);
                } else {
                    q850Var.q(aVar);
                }
            }
        }
        if (i == 3 && !c6qVar.g) {
            c6qVar.g = true;
            if (c6qVar.e == PlayState.PLAYING) {
                a.setPlayWhenReady(true);
                c6qVar.j();
            }
            s850 s850Var2 = c6qVar.b;
            if (s850Var2 != null) {
                bn40.f("onPrepared, duration=", Integer.valueOf((int) a.getDuration()));
                q850 q850Var2 = s850Var2.a;
                if (epx.f(q850Var2.i, u850.a.a)) {
                    return;
                }
                u850.f fVar = u850.f.a;
                q850Var2.i = fVar;
                q850Var2.e.onNext(fVar);
                return;
            }
            return;
        }
        if (i == 3 && !z && c6qVar.o) {
            c6qVar.o = false;
            s850 s850Var3 = c6qVar.b;
            if (s850Var3 != null) {
                a.getDuration();
                q850 q850Var3 = s850Var3.a;
                if (epx.f(q850Var3.i, u850.a.a)) {
                    return;
                }
                u850.f fVar2 = u850.f.a;
                q850Var3.i = fVar2;
                q850Var3.e.onNext(fVar2);
            }
        }
    }

    @Override // xsna.jza0.b
    public final void onRepeatModeChanged(int i) {
        bn40.b("i", Integer.valueOf(i));
    }

    @Override // xsna.jza0.b
    public final void v(jwa0 jwa0Var) {
        bn40.b("playbackParameters=", jwa0Var);
    }

    @Override // xsna.jza0.b
    public final void z(ewo0 ewo0Var, int i) {
    }
}
