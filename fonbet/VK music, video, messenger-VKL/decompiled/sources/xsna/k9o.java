package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.offline.VideoDownloadNotifierReceiver$Companion$Actions;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* compiled from: DownloadNotificationsFactory.kt */
/* loaded from: classes3.dex */
public final class k9o {
    public final Context a;
    public final op4 b;
    public final kar c;
    public final PendingIntent d;
    public final ti70 e = new ti70();

    public k9o(Context context, l9o l9oVar, lco lcoVar, op4 op4Var) {
        this.a = context;
        this.b = op4Var;
        this.c = new kar(context);
        this.d = lco.a(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CLICK, 0, context, null);
    }

    public final void a(NotificationCompat.h hVar, int i, VideoFile videoFile) {
        Context context = this.a;
        hVar.a(0, lco.a(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CANCEL, i, context, videoFile), context.getString(R.string.long_video_download_notification_cancel_btn_text));
    }

    public final void b(o7o o7oVar, VideoFile videoFile, int i, izs<? super io.reactivex.rxjava3.disposables.c, s3q0> izsVar) {
        if (((Bitmap) ((LinkedHashMap) this.b.b).get(Integer.valueOf(i))) == null) {
            final Image image = videoFile.getImage();
            io.reactivex.rxjava3.core.x o = fxc0.B().J().M1() ? fxc0.B().s().o(image, videoFile.r1()) : new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.j9o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj;
                    y8m y8mVar = new y8m(1);
                    Image image2 = Image.this;
                    Iterator it = j5g.y0(image2.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Boolean) y8mVar.invoke(obj)).booleanValue()) {
                            break;
                        }
                    }
                    ImageSize imageSize = (ImageSize) obj;
                    if (imageSize == null) {
                        for (Object obj2 : j5g.y0(image2.b)) {
                            if (((Boolean) y8mVar.invoke(obj2)).booleanValue()) {
                                imageSize = (ImageSize) obj2;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    return Uri.parse(imageSize.d.d);
                }
            });
            asu0 asu0Var = asu0.a;
            izsVar.invoke(o.q(asu0Var.c()).m(asu0Var.d()).q(asu0Var.c()).subscribe(new fq1(new f4o(this, o7oVar, i, videoFile), 13)));
        }
    }
}
