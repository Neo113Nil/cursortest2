package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.navigation.b;
import com.yandex.mapkit.directions.driving.Event;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;
import com.ybsdk.rconfig.configs.TsarButtonConfigV2;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.a;
import kotlin.reflect.KVariance;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class of11 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ of11(an11 an11Var) {
        this.a = 11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [d421] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListItemComponent listItemComponent;
        rbv entity$lambda$1$lambda$0;
        zy11 listener$lambda$0;
        boolean render$lambda$3;
        g render$lambda$9$lambda$6;
        int i = this.a;
        int i2 = 3;
        int i3 = 1;
        Integer num = null;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b}, 1));
            case 1:
                listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                break;
            case 2:
                ((wul0) obj).n1();
                return zy11Var;
            case 3:
                ((wul0) obj).n1();
                return zy11Var;
            case 4:
                wj00 b2 = ((y3x) obj).b();
                String p = b2.p("url");
                ArrayList arrayList = new ArrayList();
                List e = b2.e("tags");
                if (e != null) {
                    Iterator it = ((ArrayList) e).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((y3x) it.next()).c().b);
                    }
                }
                return new fi11(p, arrayList);
            case 5:
                listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                break;
            case 6:
                entity$lambda$1$lambda$0 = TsarButtonConfigV2.toEntity$lambda$1$lambda$0((String) obj);
                return entity$lambda$1$lambda$0;
            case 7:
                return new Result(zy11Var);
            case 8:
                wkx wkxVar = (wkx) obj;
                wkxVar.a = 2200;
                Float valueOf = Float.valueOf(0.0f);
                vkx a = wkxVar.a(0, valueOf);
                ldf ldfVar = ubn.a;
                a.b = ldfVar;
                wkxVar.a(Constants.MINIMAL_ERROR_STATUS_CODE, valueOf).b = ldfVar;
                Float valueOf2 = Float.valueOf(0.6f);
                wkxVar.a(950, valueOf2).b = ldfVar;
                wkxVar.a(1400, valueOf2).b = ldfVar;
                wkxVar.a(2200, valueOf).b = ldfVar;
                return zy11Var;
            case 9:
                wkx wkxVar2 = (wkx) obj;
                wkxVar2.a = 2200;
                Float valueOf3 = Float.valueOf(0.1f);
                vkx a2 = wkxVar2.a(0, valueOf3);
                ldf ldfVar2 = ubn.a;
                a2.b = ldfVar2;
                wkxVar2.a(Constants.MINIMAL_ERROR_STATUS_CODE, valueOf3).b = ldfVar2;
                wkxVar2.a(950, Float.valueOf(0.2f)).b = ldfVar2;
                wkxVar2.a(1400, Float.valueOf(0.18f)).b = ldfVar2;
                wkxVar2.a(2200, Float.valueOf(0.6f)).b = ldfVar2;
                return zy11Var;
            case 10:
                wkx wkxVar3 = (wkx) obj;
                wkxVar3.a = 2200;
                Float valueOf4 = Float.valueOf(0.6f);
                vkx a3 = wkxVar3.a(0, valueOf4);
                ldf ldfVar3 = ubn.a;
                a3.b = ldfVar3;
                wkxVar3.a(Constants.MINIMAL_ERROR_STATUS_CODE, valueOf4).b = ldfVar3;
                wkxVar3.a(950, Float.valueOf(0.7f)).b = ldfVar3;
                wkxVar3.a(1400, Float.valueOf(0.69f)).b = ldfVar3;
                wkxVar3.a(2200, Float.valueOf(0.8f)).b = ldfVar3;
                return zy11Var;
            case 11:
                ogx ogxVar = (ogx) obj;
                KVariance kVariance = ogxVar.a;
                if (kVariance == null) {
                    return "*";
                }
                mgx mgxVar = ogxVar.b;
                an11 an11Var = mgxVar instanceof an11 ? (an11) mgxVar : null;
                String a4 = an11Var != null ? an11Var.a(true) : String.valueOf(mgxVar);
                int i5 = zm11.a[kVariance.ordinal()];
                if (i5 == 1) {
                    return a4;
                }
                if (i5 == 2) {
                    return "in ".concat(a4);
                }
                if (i5 == 3) {
                    return "out ".concat(a4);
                }
                w511.b();
                return null;
            case 12:
                uhj uhjVar = (uhj) mbb1.d((y3x) obj, new lhj(i3)).d();
                return new ix11(uhjVar.a, uhjVar.b, uhjVar.c);
            case 13:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 14:
                listener$lambda$0 = UnconditionalWidget.listener$lambda$0((px11) obj);
                return listener$lambda$0;
            case 15:
                return new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 16:
                ListItemComponent listItemComponent2 = (ListItemComponent) obj;
                m0o m0oVar = new m0o((View) listItemComponent2, i2);
                i3y a5 = a.a(new pv01(13, m0oVar));
                aiy aiyVar = aiy.a;
                m0oVar.T = aiyVar;
                m0oVar.U = aiyVar;
                View view = (View) m0oVar.R;
                m0oVar.V = new dpu(((ListItemComponent) view).getLeadImageView(), null);
                ListItemComponent listItemComponent3 = (ListItemComponent) view;
                listItemComponent3.setTitleTextColor(new bdc(xng0.textMain));
                listItemComponent3.setTitleTypeface(3);
                listItemComponent3.setTitleTextSizePx(c.d(mrg0.component_text_size_caption, listItemComponent2));
                fh4.g(listItemComponent3.title());
                listItemComponent3.setSubtitleTextColor(new bdc(xng0.textMinor));
                listItemComponent3.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent2.getContext()));
                listItemComponent3.setClickable(false);
                listItemComponent3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent3.setLeadView((GoFrameLayout) a5.getValue());
                return m0oVar;
            case 17:
                ((jdv) obj).close();
                return zy11Var;
            case 18:
                jst.e.k((Throwable) obj, "Failed to get unread messages count from web messenger");
                return zy11Var;
            case 19:
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM unseen_view");
                try {
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "unseen");
                    int r3 = eja1.r(T0, "unseen_show");
                    int r4 = eja1.r(T0, "threads_unseen_show");
                    if (T0.q()) {
                        if (!T0.isNull(r)) {
                            num = Integer.valueOf((int) T0.getLong(r));
                        }
                        num = new d421((int) T0.getLong(r2), (int) T0.getLong(r3), (int) T0.getLong(r4), num);
                    }
                    return num;
                } finally {
                    T0.close();
                }
            case 20:
                return new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 21:
                return ((Event) obj).getEventId();
            case 22:
                render$lambda$3 = UpgradeEditFragment.render$lambda$3((Animator) obj);
                return Boolean.valueOf(render$lambda$3);
            case 23:
                render$lambda$9$lambda$6 = UpgradeEditFragment.render$lambda$9$lambda$6((g) obj);
                return render$lambda$9$lambda$6;
            case 24:
                return an91.o((f530) obj, 0.0f, 8.0f, 0.0f, 12.0f, 5);
            case 25:
                return ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
            case 26:
                return kp50.i();
            case 27:
                ((cne0) obj).a();
                return zy11Var;
            case 28:
                return ((cne0) obj).l("user_photo_id", null);
            default:
                b bVar = ((nr21) obj).a;
                ((cne0) bVar.F.a.getValue()).d().putBoolean("ShouldRestore", false).commit();
                bVar.r(new mr21(i4));
                return zy11Var;
        }
        nzs.s(listItemComponent, -1, -2);
        return listItemComponent;
    }

    public /* synthetic */ of11(int i) {
        this.a = i;
    }
}
