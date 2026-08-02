package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.b;
import com.vk.superapp.dto.ListData;
import com.vk.superapp.ui.SuperAppFragment;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.awr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bv3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bv3(CheckPresenterInfo checkPresenterInfo, SignUpRouter signUpRouter, String str) {
        this.b = 4;
        this.c = checkPresenterInfo;
        this.e = signUpRouter;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                vao.b((Context) ((dv3) obj3).b, (String) obj2, (String) obj, true, null, Boolean.TRUE, false);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                Rect rect = (Rect) obj2;
                RectF rectF = (RectF) obj;
                if (!((View) obj3).getGlobalVisibleRect(rect)) {
                    rectF.setEmpty();
                    break;
                } else {
                    rectF.set(rect);
                    break;
                }
            case 4:
                CheckPresenterInfo checkPresenterInfo = (CheckPresenterInfo) obj3;
                SignUpRouter signUpRouter = (SignUpRouter) obj;
                String str = (String) obj2;
                if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
                    if (signUpRouter != null) {
                        SignUpRouter.a.a(signUpRouter, null, null, null, null, 15);
                    }
                } else if ((checkPresenterInfo instanceof CheckPresenterInfo.Validation) && signUpRouter != null) {
                    signUpRouter.K0(str, ((CheckPresenterInfo.Validation) checkPresenterInfo).c);
                }
                break;
            case 5:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                int i2 = SuperAppFragment.o0;
                superAppFragment.g0 = ((ListData) obj2).c;
                RecyclerView recyclerView = superAppFragment.X;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                ref$ObjectRef.element = layoutManager != null ? layoutManager.onSaveInstanceState() : 0;
                break;
            case 6:
                break;
            case 7:
                ((izs) obj3).invoke(new awr0.h(((dqt0) obj2).b, p490.C((tny) ((bpf0) obj).a())));
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj3;
                tuo0 tuo0Var = (tuo0) obj;
                int c = tuo0Var.c();
                int b = tuo0Var.b();
                dateTimePickerState.getClass();
                ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.Closed.b);
                Date date = (Date) ((DateTimePickerState.DialogState.TimePicker) obj2).b;
                b.C0739b c0739b = com.vk.core.compose.component.datetime.h.a;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(0L);
                calendar.set(11, c);
                calendar.set(12, b);
                dateTimePickerState.e(date, calendar.getTime());
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bv3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
