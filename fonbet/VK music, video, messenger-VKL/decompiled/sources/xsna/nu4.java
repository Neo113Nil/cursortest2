package xsna;

import android.app.Activity;
import android.view.View;
import com.ironsource.Ce;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.sandbox.SandboxCatalogRootVh;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.webrtc.EglBase;
import org.webrtc.JniCommon;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import xsna.k5x;
import xsna.war;
import xsna.war.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((qu4) obj).t = false;
                break;
            case 1:
                ((ihz) obj).f(-1, new br(7));
                break;
            case 2:
                Ce.a((IronSourceError) obj);
                break;
            case 3:
                File file = new File(((tic) obj).b.getApplicationInfo().dataDir, "shared_prefs");
                LinkedList linkedList = new LinkedList();
                war.b bVar = nbr.u(file).new b();
                while (bVar.hasNext()) {
                    File next = bVar.next();
                    if (next.isFile() && brm0.v(next.getName(), ".xml", false)) {
                        String name = next.getName();
                        if (brm0.v(name, "_0.xml", false) || brm0.v(name, "-0.xml", false)) {
                            linkedList.push(next);
                        }
                    }
                }
                if (linkedList.isEmpty()) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ZeroPrefCleaner", "nothing to delete"});
                        break;
                    }
                } else {
                    try {
                        fo50.u(linkedList);
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"ZeroPrefCleaner", "deletion success. Deleted files=" + linkedList.size()});
                            break;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        L l3 = L.a;
                        l3.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return;
                        }
                        L.u(l3, L.LogType.d, new Object[]{"ZeroPrefCleaner", cqi.b(e, new StringBuilder("a failure occurred "))});
                        return;
                    }
                }
                break;
            case 4:
                ((EglBase.EglConnection) obj).release();
                break;
            case 5:
                q5x q5xVar = (q5x) obj;
                c63 c63Var = c63.a;
                c63.a(new p5x(q5xVar));
                Activity b = c63.b();
                if (b == null) {
                    c63.a(new o5x(q5xVar));
                    break;
                } else {
                    int i2 = k5x.b;
                    k5x.a.a(b, new s66(q5xVar));
                    break;
                }
            case 6:
                MaterialPreferenceFragment materialPreferenceFragment = ((MaterialPreferenceFragment.c) obj).d;
                WeakReference<View> weakReference = materialPreferenceFragment.d0;
                if (weakReference != null && (view = weakReference.get()) != null) {
                    e5v.a(view);
                    materialPreferenceFragment.d0 = null;
                    break;
                }
                break;
            case 7:
                ((gzs) obj).invoke();
                break;
            case 8:
                SandboxCatalogRootVh sandboxCatalogRootVh = (SandboxCatalogRootVh) obj;
                g3a.a(sandboxCatalogRootVh.p, sandboxCatalogRootVh);
                break;
            case 9:
                ((bqh0) obj).a();
                break;
            case 10:
                h03.b((Throwable) obj);
                break;
            case 11:
                qao0 qao0Var = (qao0) obj;
                qao0Var.a = new GLComputerProgram("#version 310 es\n            layout(local_size_x = 8, local_size_x = 8) in;\n            layout(std430) buffer;\n            layout(binding = 1) buffer Output { float elements[]; } output_data;\n            layout(binding = 2) buffer Input0  { float elements[]; } input_data;\n            uniform int size;\n            uniform int index;\n            void main() \n            {\n                int count = 8; \n                if (int(gl_GlobalInvocationID.x) < count || int(gl_GlobalInvocationID.x) > size - count) return;\n                \n                float sum = 0.0;\n                for (int i = -count; i < count; i++) {\n                     if ((int(gl_GlobalInvocationID.x) + int(gl_GlobalInvocationID.y)) % 100 == index) {\n                        continue;\n                     }\n                     sum = sum + input_data.elements[int(gl_GlobalInvocationID.x) + i] + sin(float(gl_GlobalInvocationID.y) / 1024.0);\n                }\n                output_data.elements[gl_GlobalInvocationID.x] = sum / (2.0 * float(count) + 1.0);\n            }\n        ");
                qao0Var.b = new GLSSBO(4096);
                qao0Var.c = new GLSSBO(4096);
                GLComputerProgram gLComputerProgram = qao0Var.a;
                if (gLComputerProgram != null) {
                    gLComputerProgram.useProgram();
                }
                GLComputerProgram gLComputerProgram2 = qao0Var.a;
                if (gLComputerProgram2 != null) {
                    gLComputerProgram2.setIntUniform("size", 1024);
                }
                GLComputerProgram gLComputerProgram3 = qao0Var.a;
                if (gLComputerProgram3 != null) {
                    gLComputerProgram3.resetProgram();
                    break;
                }
                break;
            case 12:
                JniCommon.nativeFreeByteBuffer((ByteBuffer) obj);
                break;
            case 13:
                ((yads.dd0) obj).a();
                break;
            default:
                com.vungle.ads.internal.w2.a((com.vungle.ads.internal.w2) obj);
                break;
        }
    }
}
