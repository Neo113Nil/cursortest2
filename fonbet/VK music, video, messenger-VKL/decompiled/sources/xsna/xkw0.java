package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.voip.VoipCallSource;
import com.vk.eduauth.di.ImEduAuthComponent;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.invite.AnonymCallInviteFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.clw0;
import xsna.g0x0;
import xsna.nqw0;
import xsna.phw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xkw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xkw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer d;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ykw0 ykw0Var = (ykw0) obj2;
                clw0 clw0Var = (clw0) obj;
                int i2 = ykw0.j1;
                if (clw0Var instanceof clw0.c) {
                    ((VoipCallComponent) m7m.d(ykw0Var).a(fpf0.a(VoipCallComponent.class))).a().d(new phw0.d(new WeakReference(ykw0Var.requireContext()), ((clw0.c) clw0Var).a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE), null, null, null, 0, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
                } else if (clw0Var instanceof clw0.b) {
                    Bundle arguments = ykw0Var.getArguments();
                    if (arguments != null ? epx.f(bo8.b(arguments, "before_auth"), Boolean.TRUE) : false) {
                        int i3 = AnonymCallInviteFragment.T;
                        FragmentActivity kn = ykw0Var.kn();
                        String str = ((clw0.b) clw0Var).a;
                        Bundle arguments2 = ykw0Var.getArguments();
                        int intValue = (arguments2 == null || (d = bo8.d(arguments2, "request_code")) == null) ? -1 : d.intValue();
                        AnonymCallInviteFragment.b bVar = new AnonymCallInviteFragment.b();
                        bVar.j.putString("vkJoinLink", str);
                        bVar.h(kn, intValue);
                    } else {
                        int i4 = AnonymCallInviteFragment.T;
                        Context requireContext = ykw0Var.requireContext();
                        String str2 = ((clw0.b) clw0Var).a;
                        AnonymCallInviteFragment.b bVar2 = new AnonymCallInviteFragment.b();
                        bVar2.j.putString("vkJoinLink", str2);
                        bVar2.k(requireContext);
                    }
                } else if (clw0Var instanceof clw0.d) {
                    x0w w2 = ((ImEduAuthComponent) m7m.d(ykw0Var).a(fpf0.a(ImEduAuthComponent.class))).w2();
                    ykw0Var.requireContext();
                    Uri uri = ((clw0.d) clw0Var).a;
                    w2.getClass();
                } else if (clw0Var instanceof clw0.e) {
                    izx izxVar = new izx(ykw0Var.requireContext());
                    clw0.e eVar = (clw0.e) clw0Var;
                    t89 t89Var = eVar.a;
                    izxVar.e = t89Var.a;
                    izxVar.f = t89Var.b;
                    if (eVar.b) {
                        izxVar.g = Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_tertiary));
                    }
                    izxVar.S0().Td(ykw0Var.getChildFragmentManager(), "JOIN_CALL_ERROR_BOTTOM_SHEET_TAG");
                } else {
                    if (!(clw0Var instanceof clw0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ykw0Var.dismiss();
                }
                return s3q0.a;
            case 1:
                ((drw0) obj2).d.invoke(nqw0.e.b);
                return s3q0.a;
            default:
                j0x0 j0x0Var = (j0x0) obj2;
                s6x0 s6x0Var = (s6x0) obj;
                ArrayList arrayList = s6x0Var.a;
                if (arrayList.isEmpty()) {
                    j0x0Var.T(g0x0.a.C2905a.b);
                } else {
                    j0x0Var.T(new g0x0.a.e(arrayList, arrayList.size(), s6x0Var.b > arrayList.size()));
                }
                return s3q0.a;
        }
    }
}
