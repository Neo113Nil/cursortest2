package xsna;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.music.MusicTrack;
import com.vk.media.MediaUtils;
import com.vk.pending.PendingAudioAttachment;
import com.vk.sharing.core.view.IntentAction;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import java.util.Iterator;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.h8z0;
import xsna.hjz0;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class an6 implements io.reactivex.rxjava3.core.s, uon0.a, Optional.Action, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ an6(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar = (hjz0.a) this.b;
        String str = ((tez0) this.c).F;
        yil0.d(aVar);
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onMessengerDescriptorChanged$38((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // xsna.uon0.a
    public Object execute() {
        qdq0 qdq0Var = (qdq0) this.b;
        qdq0Var.c.d1((Iterable) this.c);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    @Override // io.reactivex.rxjava3.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        long parseLong;
        BaseSharingExternalActivity.b bVar = (BaseSharingExternalActivity.b) this.b;
        IntentAction intentAction = (IntentAction) this.c;
        BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
        Iterator it = bVar.f.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (intentAction == IntentAction.SHARE_TO_MESSAGE) {
                rVar.onNext(BaseSharingExternalActivity.Y1(baseSharingExternalActivity, uri));
            } else {
                MusicTrack musicTrack = new MusicTrack();
                musicTrack.i = uri.toString();
                musicTrack.b = com.vk.upload.impl.a.d.getAndIncrement();
                int i = BaseSharingExternalActivity.Z;
                musicTrack.d = "Untitled";
                musicTrack.h = "Unknown artist";
                ThemableActivity themableActivity = baseSharingExternalActivity.i;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                r6 = null;
                MediaUtils.b bVar2 = null;
                try {
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(themableActivity, uri);
                    } catch (Throwable unused) {
                        int i2 = BaseSharingExternalActivity.Z;
                        String n = com.vk.core.files.a.n(uri);
                        if (n != null) {
                            mediaMetadataRetriever.setDataSource(n);
                        }
                        mediaMetadataRetriever.release();
                        if (bVar2 != null) {
                        }
                        rVar.onNext(new PendingAudioAttachment(musicTrack));
                    }
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(7);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(2);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata3 != null) {
                        try {
                            parseLong = Long.parseLong(extractMetadata3);
                        } catch (Exception unused2) {
                        } catch (Throwable th) {
                            th = th;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                mediaMetadataRetriever2.release();
                            }
                            throw th;
                        }
                    } else {
                        parseLong = 0;
                    }
                    MediaUtils.b bVar3 = new MediaUtils.b(parseLong, extractMetadata, extractMetadata2);
                    mediaMetadataRetriever.release();
                    bVar2 = bVar3;
                } catch (Exception unused3) {
                    mediaMetadataRetriever = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (bVar2 != null) {
                    musicTrack.f = ((int) bVar2.a) / 1000;
                    String str = bVar2.c;
                    if (str != null) {
                        musicTrack.h = str;
                    }
                    String str2 = bVar2.b;
                    if (str2 != null) {
                        musicTrack.d = str2;
                    }
                }
                rVar.onNext(new PendingAudioAttachment(musicTrack));
            }
        }
        rVar.onComplete();
    }
}
