package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.core.content.FileProvider;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.spans.impl.LinksSpansComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z56 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z56(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ezs fullyDrawnReporter_delegate$lambda$0;
        Uri uri;
        String path;
        switch (this.b) {
            case 0:
                return new ecu0((a66) this.c);
            case 1:
                return Boolean.valueOf(((k67) this.c).h);
            case 2:
                return ((BridgeComponentImpl) this.c).c.p();
            case 3:
                khg khgVar = (khg) this.c;
                return new b550(khgVar.U(), khgVar.g());
            case 4:
                fullyDrawnReporter_delegate$lambda$0 = ComponentActivity.fullyDrawnReporter_delegate$lambda$0((ComponentActivity) this.c);
                return fullyDrawnReporter_delegate$lambda$0;
            case 5:
                return ((BridgeComponent) ((LinksBridgeComponentImpl) this.c).s.getValue()).Le().z();
            case 6:
                OfflineAudioDatabase a = OfflineAudioDatabase.j.a(((OfflineAudioComponentImpl) this.c).a);
                return new yhb0(a.G(), a.D());
            case 7:
                ((y0a0) this.c).a();
                return s3q0.a;
            case 8:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ((AtomicReference) this.c).getAndSet(EmptyDisposable.INSTANCE);
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 9:
                return (SessionManagementComponentImpl.a) this.c;
            case 10:
                z2i0 z2i0Var = (z2i0) this.c;
                Context context = (Context) z2i0Var.a;
                File file = new File(context.getFilesDir(), "tmp.txt");
                try {
                    uri = FileProvider.getUriForFile(context, BuildInfo.f, file);
                } catch (Exception e) {
                    par0.a.getClass();
                    par0.d(e);
                    uri = null;
                }
                if (uri == null || (path = uri.getPath()) == null) {
                    return null;
                }
                String c = qoy.c(7, 0, path);
                ((keu0) ((bpn0) z2i0Var.b).getValue()).c().execute(new z27(file, 11));
                return c;
            default:
                return new LinksSpansComponentImpl.a(((jau0) this.c).j);
        }
    }
}
