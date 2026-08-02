package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.e;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.common.js.bridge.impl.data.ShareType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.baj;
import xsna.ds4;
import xsna.dw20;
import xsna.epx;
import xsna.gkx0;
import xsna.go5;
import xsna.gtl;
import xsna.gzs;
import xsna.i9g0;
import xsna.j5g;
import xsna.lj30;
import xsna.o6a0;
import xsna.rye;
import xsna.s3q0;
import xsna.t9j;
import xsna.x1n0;
import xsna.xwv0;
import xsna.yg20;
import xsna.zzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class g0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        VkUiView view;
        lj30 lj30Var;
        lj30 lj30Var2;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("android.intent.extra.TEXT", str2);
                xwv0 xwv0Var = l0Var.d;
                if (xwv0Var != null && (view = xwv0Var.getView()) != null) {
                    view.J3(intent, new int[0]);
                }
                x1n0.b(l0Var.L0(), ShareType.SMS.h(), str);
                break;
            case 1:
                FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                baj bajVar = (baj) this.e;
                fragmentActivity.startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null)), 0);
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                bajVar.invoke();
                break;
            case 2:
                FStack fStack = (FStack) this.c;
                FragmentEntry fragmentEntry = (FragmentEntry) this.d;
                e eVar = (e) this.e;
                while (!fStack.c.isEmpty() && !epx.f(fStack.Cb(), fragmentEntry)) {
                    eVar.K(fStack.Cb());
                    fStack.Ab();
                }
                break;
            case 3:
                yg20 yg20Var = (yg20) this.c;
                Peer peer = (Peer) this.d;
                gkx0 gkx0Var = (gkx0) this.e;
                int intValue = ((Number) yg20Var.b.invoke()).intValue();
                zzs<Peer, gkx0, Direction, Integer, List<lj30>> zzsVar = yg20Var.c;
                List<lj30> invoke = zzsVar.invoke(peer, gkx0Var, Direction.BEFORE, 2);
                boolean z = false;
                if (invoke.isEmpty()) {
                    lj30Var = null;
                    lj30Var2 = null;
                } else {
                    lj30Var2 = (lj30) j5g.Y(invoke);
                    if (lj30Var2.h.equals(gkx0Var)) {
                        lj30Var = (lj30) j5g.b0(1, invoke);
                    } else {
                        lj30Var = (lj30) j5g.b0(0, invoke);
                        lj30Var2 = null;
                    }
                }
                lj30 lj30Var3 = lj30Var2 == null ? (lj30) j5g.a0(zzsVar.invoke(peer, gkx0Var, Direction.AFTER, 1)) : null;
                boolean z2 = lj30Var2 == null ? !(lj30Var == null ? yg20Var.d(intValue, peer) : !lj30Var.j && lj30Var.l == intValue) : !(!lj30Var2.i && lj30Var2.l == intValue);
                if (lj30Var2 == null ? !(lj30Var3 == null ? yg20Var.d(intValue, peer) : !lj30Var3.i && lj30Var3.l == intValue) : !(!lj30Var2.j && lj30Var2.l == intValue)) {
                    z = true;
                }
                break;
            case 4:
                o6a0 o6a0Var = (o6a0) this.c;
                go5.d dVar = (go5.d) this.d;
                break;
            case 5:
                i9g0 i9g0Var = (i9g0) this.c;
                Context context = (Context) this.d;
                FolderType folderType = (FolderType) this.e;
                i9g0Var.c = null;
                i9g0.g(folderType != null ? R.string.vkim_folder_snackbar_reset_fail_title : R.string.vkim_snackbar_reset_fail_title, context, false);
                break;
            default:
                rye.b bVar = (rye.b) this.c;
                gtl gtlVar = (gtl) this.d;
                c cVar = (c) this.e;
                bVar.d.postDelayed(new ds4(bVar, 2), gtlVar.a);
                bVar.c(cVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ g0(t9j t9jVar, FragmentActivity fragmentActivity, Ref$ObjectRef ref$ObjectRef, baj bajVar) {
        this.b = 1;
        this.c = fragmentActivity;
        this.d = ref$ObjectRef;
        this.e = bajVar;
    }
}
