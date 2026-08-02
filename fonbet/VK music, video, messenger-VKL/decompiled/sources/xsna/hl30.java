package xsna;

import android.util.Log;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.dto.podcast.Podcast;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.prefui.views.VkSwitchItemPreference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl30 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ptk0, c680, VkSwitchItem.a, io.reactivex.rxjava3.functions.g, h8z0.b, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        t6z0 t6z0Var = (t6z0) this.c;
        hjz0.a aVar = t6z0Var.a;
        String str = t6z0Var.l.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (gcw) ((bzw) obj2).invoke(obj);
            case 2:
                return (Podcast) ((rm0) obj2).invoke(obj);
            case 3:
            case 16:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                return (String) ((n0m0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((g86) obj2).invoke(obj);
            case 5:
                return (tl60) ((bzw) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((pyz) obj2).invoke(obj);
            case 7:
                return (pw80) ((bzw) obj2).c;
            case 8:
                return (String) ((pyz) obj2).invoke(obj);
            case 9:
                return (k4f0) ((bzw) obj2).invoke(obj);
            case 10:
                return (Map) ((z6f0) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((z6f0) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.e) ((pyz) obj2).invoke(obj);
            case 13:
                return (List) ((ym80) obj2).invoke(obj);
            case 14:
                return (Pair) ((n0m0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((g86) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((z6f0) obj2).invoke(obj);
            case 18:
                return (ncq0) ((n0m0) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.e) ((n0m0) obj2).invoke(obj);
            case 20:
                Regex regex = VkAuthPhoneView.q;
                return (pno0) ((ykt0) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.b0) ((g86) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.switch.VkSwitchItem.a
    public void b(boolean z) {
        VkSwitchItemPreference vkSwitchItemPreference = (VkSwitchItemPreference) this.c;
        if (vkSwitchItemPreference.a(Boolean.valueOf(z))) {
            vkSwitchItemPreference.O(z);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (pna0) ((ec1) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.xn0) this.c).a((yads.nf2) obj);
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        xm6 xm6Var = (xm6) this.c;
        Log.e("VkHealthHuaweiHealthPermissionsProvider", "cancelAuthorization exception");
        xm6Var.invoke();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((pyz) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ykt0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((SuggestedPostsFragment) this.c).V.a(s3q0.a, (k5n0) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((yx5) this.c).invoke(obj, obj2);
    }
}
