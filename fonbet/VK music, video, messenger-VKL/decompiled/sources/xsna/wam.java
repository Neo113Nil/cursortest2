package xsna;

import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.user.UserSex;
import com.vkontakte.android.R;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wam implements izs {
    public final /* synthetic */ xam b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ UserSex d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wam(xam xamVar, CharSequence charSequence, UserSex userSex, boolean z) {
        this.b = xamVar;
        this.c = charSequence;
        this.d = userSex;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        xam xamVar = this.b;
        CharSequence charSequence = this.c;
        UserSex userSex = this.d;
        boolean z = this.e;
        xamVar.k.b().i(xamVar.i);
        edw edwVar = edw.a;
        FragmentActivity fragmentActivity = xamVar.i;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
        if (z) {
            string = fragmentActivity.getString(userSex == UserSex.FEMALE ? R.string.vkim_msg_report_spam_dialog_and_ban_toast_message_female : R.string.vkim_msg_report_spam_dialog_and_ban_toast_message_male, charSequence);
        } else {
            string = fragmentActivity.getString(R.string.vkim_msg_report_spam_dialog_toast_message);
        }
        if (edw.c) {
            tlo0.h d = oq.d(tlo0.Companion, string);
            ikv0.a aVar = new ikv0.a(fragmentActivity);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d, fragmentActivity).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            aVar.n();
        } else {
            ikv0.a aVar2 = new ikv0.a(fragmentActivity);
            aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
            aVar2.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
            edw.b(aVar2);
        }
        return s3q0.a;
    }
}
