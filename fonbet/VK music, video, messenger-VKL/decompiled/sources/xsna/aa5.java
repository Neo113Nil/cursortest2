package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.l7v;
import xsna.yuq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class aa5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, xsna.poq0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        ArrayList arrayList = null;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                yg5 yg5Var = (yg5) obj;
                ((wh50) obj3).setValue(yg5Var);
                ((s95) obj4).a(yg5Var, ha5.b((wh50) obj2));
                ((gzs) obj5).invoke();
                break;
            case 1:
                UserId userId = (UserId) obj4;
                FavoriteFolderId favoriteFolderId = (FavoriteFolderId) obj3;
                u2e u2eVar = (u2e) obj;
                s5e s5eVar = ((h5e) obj5).a;
                List list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((VideoFile) it.next()).a1());
                }
                break;
            case 2:
                String str = ClipsUploadFragmentImpl.a0;
                bdn bdnVar = bdn.a;
                break;
            case 3:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                zel zelVar = (zel) obj2;
                gq2 gq2Var = (gq2) obj;
                float floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue() - ref$FloatRef.element;
                float f = ((ggh0) obj4).f(floatValue);
                ref$FloatRef.element = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                ((Ref$FloatRef) obj3).element = ((Number) gq2Var.b()).floatValue();
                if (Math.abs(floatValue - f) > 0.5f) {
                    gq2Var.a();
                }
                zelVar.getClass();
                break;
            case 4:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                List list2 = (List) obj;
                int intValue = ((Number) list2.get(0)).intValue();
                int intValue2 = ((Number) list2.get(1)).intValue();
                ?? r0 = ((String) ref$ObjectRef.element) + ((String) ((xs2) obj4).invoke(((us2) obj3).c, Integer.valueOf(intValue), Integer.valueOf(intValue2)));
                ref$ObjectRef.element = r0;
                ((mg50) obj2).g(intValue2, r0.length());
                break;
            case 5:
                l7v b = pla.e().b();
                Rect d = w11.d((View) obj2);
                s3q0 s3q0Var = s3q0.a;
                b.getClass();
                l7v.b bVar = new l7v.b((String) obj4, b, d);
                bVar.e = new qbd(1, (gzs) obj5);
                bVar.m = 48;
                bVar.j((Activity) obj3);
                break;
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj5;
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) obj4;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj3;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) obj2;
                UserProfileAction userProfileAction = (UserProfileAction) obj;
                if (userProfileAction instanceof UserProfileAction.p.a.C1689a) {
                    nri0 nri0Var = (nri0) ref$ObjectRef2.element;
                    if (nri0Var != null) {
                        List<yuq0> y0 = nri0Var.y0();
                        if (y0 != null) {
                            arrayList = new ArrayList();
                            Iterator it2 = ((ArrayList) y0).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (!(((yuq0) next) instanceof yuq0.a)) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        nri0Var.setItems(arrayList);
                    }
                    userProfileDialogs.a.a(userProfileAction);
                } else if (userProfileAction instanceof UserProfileAction.p.a.b) {
                    userProfileDialogs.a.a(userProfileAction);
                } else {
                    ref$ObjectRef3.element = new poq0(i2, userProfileDialogs, userProfileAction);
                    dw20 dw20Var = (dw20) ref$ObjectRef4.element;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ aa5(String str, Activity activity, View view, gzs gzsVar) {
        this.b = 5;
        this.d = str;
        this.e = activity;
        this.f = view;
        this.c = gzsVar;
    }
}
