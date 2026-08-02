package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.webrtc.media_options.CallMediaOptionsChangeVerifier;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.rs10;
import xsna.s3q0;
import xsna.vui0;
import xsna.wui0;
import xsna.xui0;
import xsna.yui0;

/* compiled from: WatchTogetherCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final gzs<CallMediaOptionsChangeVerifier> mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider, gzs<? extends CallMediaOptionsChangeVerifier> gzsVar) {
        this.signalingProvider = signalingProvider;
        this.mediaOptionsDelegate = gzsVar;
    }

    private final Signaling getSignalingOrPassExceptionToOnError(izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (izsVar == null) {
            return null;
        }
        izsVar.invoke(new ConversationNotPreparedException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseErrorResponse(String str, JSONObject jSONObject, izs<? super Throwable, s3q0> izsVar) {
        String optString = jSONObject.optString("error");
        WatchTogetherError watchTogetherError = epx.f(optString, SignalingProtocol.ERROR_MOVIE_LIMIT_EXCEEDED) ? WatchTogetherError.LIMIT_EXCEEDED : epx.f(optString, SignalingProtocol.ERROR_MOVIE_NOT_FOUND) ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        if (izsVar != null) {
            izsVar.invoke(new WatchTogetherException(watchTogetherError, "Error response for " + str + " command " + jSONObject, null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMuted$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPosition$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void pause(MovieId movieId, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createUpdateMoviePauseCommand(movieId.getId(), true), new Signaling.Listener() { // from class: xsna.bcx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.pause$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.ccx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.this.parseErrorResponse("pause", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: play-yj_a6ag */
    public void mo352playyj_a6ag(MovieId movieId, float f, MoviePresetMeta moviePresetMeta, boolean z, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        CallMediaOptionsChangeVerifier invoke = this.mediaOptionsDelegate.invoke();
        if (invoke == null || !invoke.tryEnableWatchTogetherMediaOption()) {
            if (izsVar != null) {
                izsVar.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", null, 4, null));
            }
        } else {
            Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
            if (signalingOrPassExceptionToOnError == null) {
                return;
            }
            signalingOrPassExceptionToOnError.send(SignalingProtocol.createAddMovieCommand(movieId.getId(), f, moviePresetMeta, z), new Signaling.Listener() { // from class: xsna.gcx0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$0(gzs.this, jSONObject);
                }
            }, new Signaling.Listener() { // from class: xsna.hcx0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    WatchTogetherCommandExecutorImpl.this.parseErrorResponse("play", jSONObject, izsVar);
                }
            });
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void resume(MovieId movieId, gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createUpdateMoviePauseCommand(movieId.getId(), false), new rs10(1, gzsVar), new Signaling.Listener() { // from class: xsna.dcx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.this.parseErrorResponse(CampaignEx.JSON_NATIVE_VIDEO_RESUME, jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setMuted(MovieId movieId, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        int i = 1;
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createUpdateMovieMuteCommand(movieId.getId(), z), new vui0(i, gzsVar), new wui0(i, this, izsVar));
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void setPosition(MovieId movieId, long j, TimeUnit timeUnit, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createUpdateMovieOffsetCommand(movieId.getId(), j, timeUnit), new Signaling.Listener() { // from class: xsna.ecx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.setPosition$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.fcx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.this.parseErrorResponse("setPosition", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    /* renamed from: setVolume-F2PwOSs */
    public void mo353setVolumeF2PwOSs(MovieId movieId, float f, boolean z, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createUpdateMovieVolumeCommand(movieId.getId(), f, z), new Signaling.Listener() { // from class: xsna.zbx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.acx0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                WatchTogetherCommandExecutorImpl.this.parseErrorResponse("setVolume", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandsExecutor
    public void stop(MovieId movieId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(izsVar);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        int i = 1;
        signalingOrPassExceptionToOnError.send(SignalingProtocol.createRemoveMovieCommand(movieId.getId()), new xui0(i, gzsVar), new yui0(i, this, izsVar));
    }
}
