package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: CommunitySideEffectSenderDelegate.kt */
/* loaded from: classes5.dex */
public final class f2i implements p2q0, fsn0 {
    public final Object b;

    public /* synthetic */ f2i(Object obj) {
        this.b = obj;
    }

    @Override // xsna.fsn0
    public boolean a(UsersUserFullDto usersUserFullDto) {
        Integer j;
        UsersUserCountersDto R = usersUserFullDto.R();
        return !(!x19.B(usersUserFullDto) || ((R == null || (j = R.j()) == null) ? 0 : j.intValue()) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(naq0 naq0Var) {
        nbv nbvVar = (nbv) this.b;
        FragmentActivity fragmentActivity = nbvVar.b;
        ikv0 ikv0Var = nbvVar.d;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        ikv0.a aVar = new ikv0.a(fragmentActivity);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(fragmentActivity.getString(naq0Var.b()), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, fragmentActivity.getString(naq0Var.a()), new ij8(18, nbvVar, naq0Var));
        nbvVar.d = aVar.n();
    }

    @Override // xsna.p2q0
    public dql d(Context context) {
        return new dql(context);
    }

    @Override // xsna.p2q0
    public void l(View view, o2q0 o2q0Var) {
        if (view instanceof dql) {
            if (o2q0Var.b) {
                ad0.d((dql) view, o2q0Var);
            } else {
                dql dqlVar = (dql) view;
                Context context = dqlVar.getContext();
                boolean z = o2q0Var.h;
                String str = o2q0Var.d;
                boolean z2 = o2q0Var.i;
                String str2 = o2q0Var.c;
                boolean z3 = o2q0Var.g;
                if (!z) {
                    ad0.h(dqlVar, z3, z2, str, str2);
                } else if (o2q0Var.f == 0) {
                    if (o2q0Var.j) {
                        ad0.g(dqlVar, context.getString(R.string.unavailable_tab_title_no_friends, str2), z3, str);
                    } else if (z2) {
                        dqlVar.o(R.drawable.vk_icon_users_outline_56, R.attr.vk_ui_icon_secondary, context.getString(R.string.unavailable_tab_title_no_friends, str2), z3 ? context.getString(R.string.unavailable_tab_subtitle_no_friends_f) : context.getString(R.string.unavailable_tab_subtitle_no_friends_m));
                    } else {
                        dqlVar.o(R.drawable.vk_icon_users_outline_56, R.attr.vk_ui_icon_secondary, context.getString(R.string.unavailable_tab_title_no_friends, str2), z3 ? context.getString(R.string.unavailable_tab_subtitle_follow_suggestion_f) : context.getString(R.string.unavailable_tab_subtitle_follow_suggestion_m));
                    }
                }
            }
            ad0.f((dql) view, o2q0Var, (q7) this.b);
        }
    }

    public f2i(int i) {
        switch (i) {
            case 2:
                this.b = new yd10();
                break;
            default:
                this.b = new f4z();
                break;
        }
    }
}
