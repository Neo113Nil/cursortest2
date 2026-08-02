package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import android.widget.EditText;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ta5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ta5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                bc90 bc90Var = (bc90) obj5;
                yvj yvjVar = (yvj) obj3;
                izs izsVar = (izs) obj2;
                AuthorHeaderEvent authorHeaderEvent = (AuthorHeaderEvent) obj;
                wb90 wb90Var = new wb90((mc90) obj6, bc90Var, (ka5) obj4, yvjVar);
                int i2 = bc90Var.b;
                if (authorHeaderEvent instanceof AuthorHeaderEvent.a.c.C1665c) {
                    if (i2 > 1) {
                        myc0.h(yvjVar, null, null, new ab5(wb90Var, null), 3);
                    }
                } else if (!(authorHeaderEvent instanceof AuthorHeaderEvent.a.c.e)) {
                    izsVar.invoke(authorHeaderEvent);
                    s3q0 s3q0Var = s3q0.a;
                } else if (i2 > 1) {
                    myc0.h(yvjVar, null, null, new bb5(wb90Var, null), 3);
                }
                break;
            case 1:
                CheckBox checkBox = (CheckBox) obj6;
                String str = (String) obj5;
                yku ykuVar = (yku) obj4;
                String str2 = (String) obj3;
                EditText editText = (EditText) obj2;
                if (((Boolean) obj).booleanValue()) {
                    SharedPreferences sharedPreferences = i0y.a;
                    qaj0.c(i0y.a, "remember_name", checkBox.isChecked() ? str : null);
                    ykuVar.invoke(str2, str);
                } else {
                    Context context = editText.getContext();
                    enj.r(context, context.getString(R.string.error_invalid_name), 0);
                }
                break;
            default:
                nkd nkdVar = (nkd) obj4;
                ikd ikdVar = (ikd) obj3;
                pwf0 pwf0Var = (pwf0) obj2;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                wjs0.a(new fyr0(clipVideoFile));
                if (epx.f((UserId) obj6, (UserId) obj5)) {
                    if (nkdVar != null) {
                        nkdVar.a(ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, ikdVar.a);
                    }
                    wjs0.a(new wxr0(clipVideoFile, null, null, 6));
                }
                pwf0Var.b.Fc().c();
                break;
        }
        return s3q0.a;
    }
}
