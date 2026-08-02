package defpackage;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.semantics.f;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import com.yandex.go.due.data.api.dto.TimeRange;
import com.yandex.go.explorer.impl.ui.map.e;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import com.yandex.go.superapp.unified_polling.a;
import com.yandex.go.taxi.order.feed.api.FeedVisibilityState;
import com.yandex.messaging.experiments.ExperimentName;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.presentation.error.failedVerifcation.FailedVerificationFragment;
import ru.rt.ebs.cryptosdk.presentation.esiaAuth.EsiaAuthEbsFragment;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.eatskit.internal.nativeapi.EatsNativeApi;

/* loaded from: classes5.dex */
public final /* synthetic */ class dzm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dzm(zkn zknVar, jnn jnnVar) {
        this.a = 6;
        this.b = zknVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a A[Catch: all -> 0x02ac, TryCatch #0 {all -> 0x02ac, blocks: (B:98:0x0231, B:99:0x0248, B:101:0x024e, B:104:0x025e, B:106:0x0263, B:108:0x026b, B:113:0x027c, B:117:0x028a, B:119:0x02a3, B:122:0x0284, B:110:0x0278, B:125:0x025a), top: B:97:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0284 A[Catch: all -> 0x02ac, TryCatch #0 {all -> 0x02ac, blocks: (B:98:0x0231, B:99:0x0248, B:101:0x024e, B:104:0x025e, B:106:0x0263, B:108:0x026b, B:113:0x027c, B:117:0x028a, B:119:0x02a3, B:122:0x0284, B:110:0x0278, B:125:0x025a), top: B:97:0x0231 }] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        zy11 onWebViewLoadError$lambda$0;
        String concat;
        StringBuilder sb;
        int i;
        zy11 onViewCreated$lambda$3;
        zy11 initView$lambda$1;
        ExperimentName experimentName;
        String Y1;
        c cVar;
        zy11 insetsType$lambda$0;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        AnchorBottomSheetBehavior bottomSheetBehavior2;
        zy11 initView$lambda$3$lambda$2;
        zy11 onViewCreated$lambda$32;
        Object builderGetter$lambda$0;
        Object obj2;
        Object instanceGetter$lambda$1;
        Object instanceGetter$lambda$2;
        String str4;
        int i2 = this.a;
        String str5 = null;
        str = "";
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                DateFormat dateFormat = (DateFormat) obj3;
                TimeRange timeRange = (TimeRange) obj;
                Calendar calendar = timeRange.a;
                Calendar calendar2 = timeRange.b;
                if (calendar != null) {
                    dateFormat.setTimeZone(calendar.getTimeZone());
                    str2 = dateFormat.format(calendar.getTime());
                } else {
                    str2 = null;
                }
                if (calendar2 != null) {
                    dateFormat.setTimeZone(calendar2.getTimeZone());
                    str5 = dateFormat.format(calendar2.getTime());
                }
                return unr0.p("[", str2, " – ", str5, "]");
            case 1:
                q5n q5nVar = (q5n) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                String str6 = q5nVar.d.a;
                cyu0 cyu0Var = q5nVar.e;
                if (cyu0Var != null && (str3 = cyu0Var.a) != null) {
                    str = str3;
                }
                f.l(mnq0Var, str6 + Extension.FIX_SPACE + str);
                return zy11Var;
            case 2:
                f6n f6nVar = (f6n) obj3;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 0);
                String str7 = f6nVar.c;
                String str8 = f6nVar.d;
                f.l(mnq0Var2, str7 + Extension.FIX_SPACE + (str8 != null ? str8 : ""));
                return zy11Var;
            case 3:
                ((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.f) obj3).b.z((nr) obj);
                return zy11Var;
            case 4:
                a aVar = (a) obj3;
                jst.e.k((Throwable) obj, "Error during updating service orders: retry attempts count exceeded");
                int i3 = aVar.t;
                CopyOnWriteArrayList copyOnWriteArrayList = aVar.p;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((ScheduledFuture) it.next()).cancel(true);
                }
                copyOnWriteArrayList.clear();
                aVar.t = i3;
                copyOnWriteArrayList.add(aVar.n.schedule(new uhm(8, aVar), i3, TimeUnit.SECONDS));
                return zy11Var;
            case 5:
                onWebViewLoadError$lambda$0 = EatsNativeApi.onWebViewLoadError$lambda$0((EatsNativeApi) obj3, (f8o) obj);
                return onWebViewLoadError$lambda$0;
            case 6:
                zkn zknVar = (zkn) obj;
                String str9 = ((zkn) obj3) == zknVar ? " > " : "   ";
                if (zknVar instanceof fnc) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    fnc fncVar = (fnc) zknVar;
                    sb.append(fncVar.a.b.length());
                    sb.append(", newCursorPosition=");
                    i = fncVar.b;
                } else {
                    if (!(zknVar instanceof n2r0)) {
                        if (zknVar instanceof m2r0) {
                            concat = ((m2r0) zknVar).toString();
                        } else if (zknVar instanceof csh) {
                            concat = ((csh) zknVar).toString();
                        } else if (zknVar instanceof dsh) {
                            concat = ((dsh) zknVar).toString();
                        } else if (zknVar instanceof d4r0) {
                            concat = ((d4r0) zknVar).toString();
                        } else if (zknVar instanceof u9r) {
                            concat = "FinishComposingTextCommand()";
                        } else if (zknVar instanceof cj4) {
                            concat = "BackspaceCommand()";
                        } else if (zknVar instanceof crh) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String d = qoi0.a(zknVar.getClass()).d();
                            if (d == null) {
                                d = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(d);
                        }
                        return str9.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    n2r0 n2r0Var = (n2r0) zknVar;
                    sb.append(n2r0Var.a.b.length());
                    sb.append(", newCursorPosition=");
                    i = n2r0Var.b;
                }
                concat = oyr.s(sb, i, ')');
                return str9.concat(concat);
            case 7:
                f.l((mnq0) obj, ((l611) obj3).f);
                return zy11Var;
            case 8:
                onViewCreated$lambda$3 = ErrorFragment.onViewCreated$lambda$3((ErrorFragment) obj3, (mx60) obj);
                return onViewCreated$lambda$3;
            case 9:
                initView$lambda$1 = EsiaAuthEbsFragment.initView$lambda$1((EsiaAuthEbsFragment) obj3, (View) obj);
                return initView$lambda$1;
            case 10:
                w96 w96Var = (w96) obj;
                return w96Var.h() ? w96Var : (w96) obj3;
            case 11:
                mqo mqoVar = ((bro) obj3).c;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM experiments;");
                try {
                    int r = eja1.r(T0, "experiment_id");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, Constants.KEY_DATA);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        long j = T0.getLong(r);
                        String Y12 = T0.isNull(r2) ? null : T0.Y1(r2);
                        mqoVar.getClass();
                        if (Y12 != null) {
                            ExperimentName[] values = ExperimentName.values();
                            int length = values.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                experimentName = values[i4];
                                if (jl40.l(experimentName.getUaasId(), Y12)) {
                                    Y1 = !T0.isNull(r3) ? null : T0.Y1(r3);
                                    if (Y1 == null) {
                                        rbx rbxVar = sbx.d;
                                        rbxVar.getClass();
                                        cVar = (c) rbxVar.b(qke.n(c.Companion.serializer()), Y1);
                                    } else {
                                        cVar = null;
                                    }
                                    arrayList.add(new nqo(j, experimentName, cVar));
                                }
                            }
                        }
                        experimentName = null;
                        if (!T0.isNull(r3)) {
                        }
                        if (Y1 == null) {
                        }
                        arrayList.add(new nqo(j, experimentName, cVar));
                    }
                    return arrayList;
                } finally {
                    T0.close();
                }
            case 12:
                ((e) obj3).invoke();
                return zy11Var;
            case 13:
                insetsType$lambda$0 = ExternalServiceModalView.insetsType$lambda$0((ExternalServiceModalView) obj3, (t1w) obj);
                return insetsType$lambda$0;
            case 14:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ExternalServiceModalView externalServiceModalView = ((d2p) obj3).a;
                if (booleanValue) {
                    bottomSheetBehavior2 = externalServiceModalView.getBottomSheetBehavior();
                    bottomSheetBehavior2.a0 = true;
                } else {
                    bottomSheetBehavior = externalServiceModalView.getBottomSheetBehavior();
                    bottomSheetBehavior.a0 = false;
                }
                return zy11Var;
            case 15:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.h(gw00.e(new Pair("is_passport_ready", Boolean.valueOf(((bp90) ((jdj) obj3).b).a))));
                return w3j0Var.l();
            case 16:
                initView$lambda$3$lambda$2 = FailedVerificationFragment.initView$lambda$3$lambda$2((FailedVerificationFragment) obj3, (View) obj);
                return initView$lambda$3$lambda$2;
            case 17:
                onViewCreated$lambda$32 = FamilyFragment.onViewCreated$lambda$3((FamilyFragment) obj3, (mx60) obj);
                return onViewCreated$lambda$32;
            case 18:
                w7v0 w7v0Var = ((ru.yandex.taxi.favorites.data.repo.a) obj3).h;
                i4v0 i4v0Var = i4v0.j;
                i4v0 c = sms.c(null);
                w7v0Var.getClass();
                return w7v0.a((ksw) obj, c, false, null, null);
            case 19:
                ((Boolean) obj).getClass();
                ((kfp) obj3).run();
                return zy11Var;
            case 20:
                frq frqVar = (frq) obj3;
                if (jl40.l(((c231) obj).d(), Boolean.TRUE)) {
                    ((hrq) frqVar.b).a.l(FeedVisibilityState.HIDE);
                }
                return zy11Var;
            case 21:
                f.l((mnq0) obj, ((mfz0) obj3).getTitle());
                return zy11Var;
            case 22:
                euq euqVar = (euq) obj3;
                LinkedHashSet linkedHashSet = euqVar.B;
                LinkedHashSet linkedHashSet2 = euqVar.A;
                linkedHashSet.clear();
                Set set = (Set) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : set) {
                    if (euqVar.y.contains((CallFeedbackReason) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                linkedHashSet.addAll(arrayList2);
                linkedHashSet2.clear();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : set) {
                    if (euqVar.z.contains((CallFeedbackReason) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                linkedHashSet2.addAll(arrayList3);
                ArrayList arrayList4 = euqVar.C;
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    CallFeedbackReason callFeedbackReason = (CallFeedbackReason) it2.next();
                    View view = (View) euqVar.D.get(callFeedbackReason);
                    if (view != null) {
                        view.setSelected(v4r0.h(linkedHashSet, linkedHashSet2).contains(callFeedbackReason));
                    }
                }
                TextView textView = euqVar.E;
                int size = v4r0.g(v4r0.h(linkedHashSet, linkedHashSet2), arrayList4).size();
                Activity activity = euqVar.a;
                textView.setText(size == 0 ? activity.getResources().getString(oyh0.call_feedback_more_reasons) : activity.getResources().getQuantityString(ewh0.calls_feedback_show_all_reasons_button_text, size, Integer.valueOf(size)));
                textView.setSelected(size != 0);
                return zy11Var;
            case 23:
                builderGetter$lambda$0 = FieldBinding.getBuilderGetter$lambda$0((WireField) obj3, (Message.Builder) obj);
                return builderGetter$lambda$0;
            case 24:
                obj2 = ((Field) obj3).get((Message.Builder) obj);
                return obj2;
            case 25:
                instanceGetter$lambda$1 = FieldBinding.getInstanceGetter$lambda$1((Method) obj3, (Message) obj);
                return instanceGetter$lambda$1;
            case 26:
                instanceGetter$lambda$2 = FieldBinding.getInstanceGetter$lambda$2((FieldBinding) obj3, (Message) obj);
                return instanceGetter$lambda$2;
            case 27:
                mxq mxqVar = (mxq) obj3;
                mnq0 mnq0Var3 = (mnq0) obj;
                boolean z = mxqVar.e;
                String str10 = mxqVar.c;
                CharSequence charSequence = mxqVar.d;
                if (z) {
                    str4 = ((Object) charSequence) + Extension.FIX_SPACE + (str10 != null ? str10 : "");
                } else {
                    str4 = (str10 != null ? str10 : "") + Extension.FIX_SPACE + ((Object) charSequence);
                }
                f.l(mnq0Var3, str4);
                return zy11Var;
            case 28:
                u0r u0rVar = (u0r) obj3;
                u0rVar.f = true;
                if (u0rVar.e == null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    DisplayMetrics displayMetrics = e8m.a;
                    gradientDrawable.setCornerRadius(8.0f * displayMetrics.density);
                    gradientDrawable.setStroke((int) (0.5f * displayMetrics.density), fxa1.c(jng0.messagingCommonDividerColor, u0rVar.a).data);
                    u0rVar.e = gradientDrawable;
                }
                ImageView imageView = u0rVar.b;
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setBackground(u0rVar.e);
                imageView.setClipToOutline(true);
                return zy11Var;
            default:
                return Boolean.valueOf(!((File) obj).equals((File) ((m) obj3).g));
        }
    }

    public /* synthetic */ dzm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
