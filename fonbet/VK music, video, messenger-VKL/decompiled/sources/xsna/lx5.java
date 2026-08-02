package xsna;

import android.app.Dialog;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;
import com.vk.log.L;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.toggle.b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import ru.mail.libverify.n.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class lx5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lx5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                nx5 nx5Var = (nx5) obj2;
                ?? apply = ((szs) obj).apply(nx5Var.e);
                nx5Var.e = apply;
                mx5 mx5Var = new mx5(0, nx5Var, apply);
                otu otuVar = nx5Var.b;
                if (otuVar.getLooper().getThread().isAlive()) {
                    otuVar.post(mx5Var);
                    return;
                }
                return;
            case 1:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                PhotoEditorView photoEditorView = ((com.vk.attachpicker.screen.f) obj2).p;
                if (photoEditorView != null) {
                    photoEditorView.setAlpha(1.0f);
                }
                Dialog dialog = (Dialog) ref$ObjectRef.element;
                if (dialog != null) {
                    qv20.b(dialog);
                    return;
                }
                return;
            case 2:
                vm30 vm30Var = (vm30) obj2;
                String str = (String) obj;
                if (vm30Var.u.hasPendingAdapterUpdates()) {
                    vm30Var.s(str);
                    return;
                }
                MsgLinearLayoutManager msgLinearLayoutManager = vm30Var.I;
                int v = msgLinearLayoutManager.v();
                int x = msgLinearLayoutManager.x();
                int itemCount = msgLinearLayoutManager.getItemCount();
                if (v == -1 || x == -1) {
                    return;
                }
                vm30Var.n(v, x, itemCount, str);
                return;
            case 3:
                ks80.e((OneVideoPlayer) obj2, (x2y) obj);
                return;
            case 4:
                File file = (File) obj2;
                Map<String, ? extends b.d> map = (Map) obj;
                try {
                    String parent = file.getParent();
                    if (parent != null) {
                        new File(parent).mkdir();
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), emb.b), 8192);
                    try {
                        bufferedWriter.write(com.vk.toggle.b.A.z(map));
                        s3q0 s3q0Var = s3q0.a;
                        bufferedWriter.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(bufferedWriter, th);
                            throw th2;
                        }
                    }
                } catch (InterruptedIOException e) {
                    L.G("Toggles dumping interrupted");
                    throw e;
                } catch (InterruptedException e2) {
                    L.G("Toggles dumping interrupted");
                    throw e2;
                } catch (Throwable th3) {
                    L.j(th3, m5k.b(th3, new StringBuilder("Error dumping Toggles: ")));
                    return;
                }
            default:
                ru.mail.libverify.n.h.a((g.b) obj2, (List) ((ArrayList) obj));
                return;
        }
    }

    public /* synthetic */ lx5(ks80 ks80Var, OneVideoPlayer oneVideoPlayer, x2y x2yVar) {
        this.b = 3;
        this.c = oneVideoPlayer;
        this.d = x2yVar;
    }
}
