package xsna;

import com.vk.content.design.view.camera.a;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.cwb0;

/* compiled from: MaskWrapVirtualBackground.kt */
/* loaded from: classes7.dex */
public final class sg10 implements a.b {
    public final cpk a;
    public final d80 b;

    /* compiled from: MaskWrapVirtualBackground.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EffectRegistry.EffectId.values().length];
            try {
                iArr[EffectRegistry.EffectId.SPHERE_IMAGE0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EffectRegistry.EffectId.SPHERE_VIDEO0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sg10(cpk cpkVar, d80 d80Var) {
        this.a = cpkVar;
        this.b = d80Var;
    }

    public static final boolean d(Mask mask, boolean z) {
        List<k9x> list = pw70.a;
        EffectRegistry.EffectId b = pw70.b(mask.d);
        int i = b == null ? -1 : a.$EnumSwitchMapping$0[b.ordinal()];
        return mask.k != null && (z || !(i == 1 || i == 2));
    }

    @Override // com.vk.content.design.view.camera.a.b
    public final void a(Mask mask) {
        cpk cpkVar = this.a;
        bzb0.d(cpkVar.c, new cwb0.a1(R.string.voip_delete_custom_virtual_background_dialog_title, null, R.string.voip_delete_custom_virtual_background_dialog_message, null, R.string.delete, null, R.string.cancel, null, null, null, 938), new xk(10, cpkVar, mask), null, null, 28);
    }

    @Override // com.vk.content.design.view.camera.a.b
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b() {
        String s;
        gpk gpkVar = this.a.g;
        io.reactivex.rxjava3.core.t T = gpkVar.a() ? ((kpk) gpkVar.b.getValue()).f : io.reactivex.rxjava3.core.q.T(EmptyList.b);
        d80 d80Var = this.b;
        d80Var.getClass();
        int libVersionCode = EffectNativeSink.getLibVersionCode() + 1000000;
        vh10 vh10Var = new vh10("masks.getEffectsCalls");
        vh10Var.C(0, "model_version");
        vh10Var.C(libVersionCode, "code_version");
        vh10Var.d = true;
        UserId userId = (UserId) d80Var.b;
        if (fkq0.c(userId) && !o25.a().a(userId) && (s = o25.a().s(userId)) != null) {
            vh10Var.l = s;
            vh10Var.m = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = io.reactivex.rxjava3.core.q.m(T, rsg0.y0(vh10Var, null, null, 3), new skd()).U(new i3u(new ym1(1, this, sg10.class, "mapMaskListToMaskItemList", "mapMaskListToMaskItemList(Ljava/util/List;)Ljava/util/List;", 0, 7), 3));
        b0y b0yVar = new b0y(new vfk(this, 24), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(b0yVar, lVar, kVar, kVar).U(new nit(new mx4(1, this, sg10.class, "filterAvailableMasks", "filterAvailableMasks(Ljava/util/List;)Ljava/util/List;", 0, 5), 5)).U(new hnl(tg10.b, 1));
    }

    @Override // com.vk.content.design.view.camera.a.b
    public final void c() {
        this.a.a();
    }
}
