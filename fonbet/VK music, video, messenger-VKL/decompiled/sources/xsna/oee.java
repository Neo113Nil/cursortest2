package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyCellView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class oee implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oee(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                pee peeVar = (pee) this.c;
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) this.d;
                Context context = (Context) this.e;
                io.reactivex.rxjava3.disposables.c subscribe = bug0.d(o0r0.e(peeVar.a, author.a, null, null, (AdminLeaveAction) obj, 6).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, null, 6).subscribe(new y50(new qt5(4, (izs) this.f, author), 16));
                Activity b = gnj.b(context);
                if (b != null) {
                    context = b;
                }
                ver0.c(context, subscribe);
                break;
            case 1:
                et50 et50Var = (et50) this.c;
                MyTargetBrandLiftSurvey.Answer answer = (MyTargetBrandLiftSurvey.Answer) this.d;
                List list = (List) this.e;
                MyTargetBrandLiftSurvey.Question question = (MyTargetBrandLiftSurvey.Question) this.f;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LinkedHashMap linkedHashMap = et50Var.p1;
                String str = question.b;
                String str2 = question.d;
                List list2 = (List) linkedHashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                int i = answer.c;
                String str3 = answer.b;
                if (i != 2) {
                    if (booleanValue) {
                        list2.add(str3);
                    } else {
                        list2.remove(str3);
                    }
                    if (str2.equals("one_answer")) {
                        if (booleanValue) {
                            list2.clear();
                            list2.add(str3);
                            et50Var.ao(str, str3);
                        }
                    } else if (str2.equals("multiple_answers")) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((MyTargetBrandLiftSurvey.Answer) obj2).c == 2) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        MyTargetBrandLiftSurvey.Answer answer2 = (MyTargetBrandLiftSurvey.Answer) obj2;
                        if (answer2 != null) {
                            String str4 = answer2.b;
                            if (list2.contains(str3) && booleanValue) {
                                list2.remove(str4);
                                et50Var.Zn(str, str4);
                            }
                        }
                    }
                } else if (booleanValue) {
                    list2.clear();
                    list2.add(str3);
                    et50Var.ao(str, str3);
                } else {
                    list2.remove(str3);
                }
                linkedHashMap.put(str, list2);
                MyTargetAdSurveyButtonsView myTargetAdSurveyButtonsView = et50Var.m1;
                if (myTargetAdSurveyButtonsView != null) {
                    LinearLayout linearLayout = et50Var.l1;
                    boolean z = false;
                    if (linearLayout != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < linearLayout.getChildCount()) {
                                View childAt = linearLayout.getChildAt(i2);
                                if ((childAt instanceof MyTargetAdSurveyCellView) && ((MyTargetAdSurveyCellView) childAt).d.isChecked()) {
                                    z = true;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    myTargetAdSurveyButtonsView.setNextButtonEnabled(z);
                    myTargetAdSurveyButtonsView.setFinishButtonEnabled(z);
                }
                Intent intent = new Intent("com.vkontakte.android.AD_HANDLE_BLS_CLICK");
                Bundle bundle = et50Var.f1;
                Integer d = bundle != null ? bo8.d(bundle, "ADS_ENTRY_HASH") : null;
                Bundle bundle2 = et50Var.f1;
                NewsEntry newsEntry = bundle2 != null ? (NewsEntry) bundle2.getParcelable("ADS_NEWS_ITEM") : null;
                if (d == null) {
                    if (newsEntry != null) {
                        intent.putExtra("ad_entry", newsEntry);
                    }
                    break;
                } else {
                    intent.putExtra("ad_entry_hash", d.intValue());
                }
                Context context2 = e43.a;
                n2i0.a(context2 != null ? context2 : null, hf8.a, intent);
                break;
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.c;
                wdt0 wdt0Var = (wdt0) this.d;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.e;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) this.f;
                int intValue = ((Integer) obj).intValue();
                ref$IntRef.element = intValue;
                wdt0Var.g(intValue, ref$IntRef2.element, ref$IntRef3.element);
                break;
        }
        return s3q0.a;
    }
}
