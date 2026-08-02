package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyCellView;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: MyTargetSurveyBottomSheet.kt */
/* loaded from: classes3.dex */
public final class et50 extends dw20 {
    public static final /* synthetic */ int q1 = 0;
    public Bundle f1;
    public VkPlaceholder g1;
    public LinearLayout h1;
    public VkText i1;
    public VkText j1;
    public VkImage k1;
    public LinearLayout l1;
    public MyTargetAdSurveyButtonsView m1;
    public int n1;
    public boolean o1;
    public final LinkedHashMap p1 = new LinkedHashMap();

    /* compiled from: MyTargetSurveyBottomSheet.kt */
    public static final class a extends dw20.b {
        public MyTargetBrandLiftSurvey e;
        public NewsEntry f;
        public Map<String, ? extends List<String>> g;
        public Integer h;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.fragment_my_target_survey, (ViewGroup) null, false);
            D0(inflate, false);
            w0(this.c.getString(R.string.bls_modal_header));
            s(enj.e(R.drawable.vk_icon_cancel_28, R.attr.vk_ui_icon_accent_themed, this.c));
            t();
            c(new ft50(inflate));
            I(true);
            et50 et50Var = new et50();
            Bundle b = yfb.b(new Pair("MY_TARGET_BLS", this.e));
            NewsEntry newsEntry = this.f;
            if (newsEntry != null) {
                b.putParcelable("ADS_NEWS_ITEM", newsEntry);
            }
            Integer num = this.h;
            if (num != null) {
                b.putInt("ADS_ENTRY_HASH", num.intValue());
            }
            Map<String, ? extends List<String>> map = this.g;
            if (map != null) {
                b.putSerializable("PRESELECTED_ANSWERS", new HashMap(map));
            }
            et50Var.f1 = b;
            return et50Var;
        }
    }

    public final MyTargetBrandLiftSurvey Yn() {
        Bundle bundle = this.f1;
        if (bundle != null) {
            return (MyTargetBrandLiftSurvey) bundle.getParcelable("MY_TARGET_BLS");
        }
        return null;
    }

    public final void Zn(String str, String str2) {
        Object obj;
        MyTargetBrandLiftSurvey Yn = Yn();
        MyTargetAdSurveyCellView myTargetAdSurveyCellView = null;
        if (Yn != null) {
            Iterator<T> it = Yn.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((MyTargetBrandLiftSurvey.Question) obj).b.equals(str)) {
                        break;
                    }
                }
            }
            MyTargetBrandLiftSurvey.Question question = (MyTargetBrandLiftSurvey.Question) obj;
            if (question != null) {
                Iterator<MyTargetBrandLiftSurvey.Answer> it2 = question.e.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (it2.next().b.equals(str2)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    LinearLayout linearLayout = this.l1;
                    KeyEvent.Callback childAt = linearLayout != null ? linearLayout.getChildAt(i) : null;
                    if (childAt instanceof MyTargetAdSurveyCellView) {
                        myTargetAdSurveyCellView = (MyTargetAdSurveyCellView) childAt;
                    }
                }
            }
        }
        if (myTargetAdSurveyCellView != null) {
            myTargetAdSurveyCellView.setChecked(false);
        }
        LinkedHashMap linkedHashMap = this.p1;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        list.remove(str2);
        linkedHashMap.put(str, list);
    }

    public final void ao(String str, String str2) {
        Object obj;
        MyTargetBrandLiftSurvey Yn = Yn();
        if (Yn != null) {
            Iterator<T> it = Yn.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MyTargetBrandLiftSurvey.Question) obj).b.equals(str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MyTargetBrandLiftSurvey.Question question = (MyTargetBrandLiftSurvey.Question) obj;
            if (question != null) {
                for (MyTargetBrandLiftSurvey.Answer answer : question.e) {
                    if (!answer.b.equals(str2) && answer.c != 2) {
                        Zn(str, answer.b);
                    }
                }
            }
        }
    }

    public final void bo(MyTargetBrandLiftSurvey.Question question) {
        int i;
        MyTargetBrandLiftSurvey.Question question2;
        List<MyTargetBrandLiftSurvey.Answer> list = question.e;
        int size = list.size();
        LinearLayout linearLayout = this.l1;
        int childCount = linearLayout != null ? linearLayout.getChildCount() : 0;
        if (childCount < size) {
            while (childCount < size) {
                View myTargetAdSurveyCellView = new MyTargetAdSurveyCellView(requireContext(), null, 0, 14, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = childCount == 0 ? cn70.b(0) : cn70.b(8);
                myTargetAdSurveyCellView.setLayoutParams(layoutParams);
                LinearLayout linearLayout2 = this.l1;
                if (linearLayout2 != null) {
                    int indexOfChild = linearLayout2.indexOfChild(this.m1);
                    LinearLayout linearLayout3 = this.l1;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(myTargetAdSurveyCellView, indexOfChild);
                    }
                }
                childCount++;
            }
        } else if (childCount > size && size <= childCount - 1) {
            while (true) {
                LinearLayout linearLayout4 = this.l1;
                if (linearLayout4 != null) {
                    linearLayout4.removeViewAt(i);
                }
                if (i == size) {
                    break;
                } else {
                    i--;
                }
            }
        }
        MyTargetAdSurveyCellView.Type type = question.d.equals("multiple_answers") ? MyTargetAdSurveyCellView.Type.Square : MyTargetAdSurveyCellView.Type.Radio;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            MyTargetBrandLiftSurvey.Answer answer = (MyTargetBrandLiftSurvey.Answer) obj;
            LinearLayout linearLayout5 = this.l1;
            View childAt = linearLayout5 != null ? linearLayout5.getChildAt(i2) : null;
            MyTargetAdSurveyCellView myTargetAdSurveyCellView2 = childAt instanceof MyTargetAdSurveyCellView ? (MyTargetAdSurveyCellView) childAt : null;
            if (myTargetAdSurveyCellView2 != null) {
                myTargetAdSurveyCellView2.setIcon(answer.d);
                myTargetAdSurveyCellView2.setTitle(answer.e);
                myTargetAdSurveyCellView2.setOnCheckedChangedListener(null);
                List list2 = (List) this.p1.get(question.b);
                myTargetAdSurveyCellView2.setChecked(list2 != null ? list2.contains(answer.b) : false);
                myTargetAdSurveyCellView2.setType(type);
                question2 = question;
                myTargetAdSurveyCellView2.setOnCheckedChangedListener(new oee(this, answer, list, question2, 1));
                myTargetAdSurveyCellView2.setOnClickListener(new yg1(myTargetAdSurveyCellView2, 7));
            } else {
                question2 = question;
            }
            question = question2;
            i2 = i3;
        }
    }

    public final void co(MyTargetBrandLiftSurvey.Question question, List<MyTargetBrandLiftSurvey.Question> list) {
        boolean z = false;
        boolean z2 = list.indexOf(question) >= e43.h(list);
        MyTargetAdSurveyButtonsView myTargetAdSurveyButtonsView = this.m1;
        if (myTargetAdSurveyButtonsView != null) {
            boolean z3 = (list.indexOf(question) == 0 || this.o1) ? false : true;
            VkButton vkButton = myTargetAdSurveyButtonsView.b;
            awt0.v(vkButton, z3);
            vkButton.setText(R.string.bls_button_back);
            boolean z4 = !this.o1;
            int i = z2 ? R.string.bls_modal_button_vote : R.string.bls_button_next;
            VkButton vkButton2 = myTargetAdSurveyButtonsView.c;
            awt0.v(vkButton2, z4);
            vkButton2.setText(i);
            boolean z5 = this.o1;
            VkButton vkButton3 = myTargetAdSurveyButtonsView.d;
            awt0.v(vkButton3, z5);
            vkButton3.setText(R.string.bls_button_finish);
            myTargetAdSurveyButtonsView.a(new np5(17, this, list), new hsg(z2, this, question, list), new e2s(this, 18));
        }
        MyTargetAdSurveyButtonsView myTargetAdSurveyButtonsView2 = this.m1;
        if (myTargetAdSurveyButtonsView2 != null) {
            LinearLayout linearLayout = this.l1;
            if (linearLayout != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= linearLayout.getChildCount()) {
                        break;
                    }
                    View childAt = linearLayout.getChildAt(i2);
                    if ((childAt instanceof MyTargetAdSurveyCellView) && ((MyTargetAdSurveyCellView) childAt).d.isChecked()) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            myTargetAdSurveyButtonsView2.setNextButtonEnabled(z);
            myTargetAdSurveyButtonsView2.setFinishButtonEnabled(z);
        }
    }

    public final void eo(MyTargetBrandLiftSurvey.Question question) {
        ArrayList arrayList;
        ImageSize imageSize;
        VkImage vkImage = this.k1;
        if (vkImage != null) {
            awt0.v(vkImage, !question.f.isEmpty());
        }
        Image image = (Image) j5g.a0(question.f);
        if (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) {
            return;
        }
        com.vk.dto.common.im.Image image2 = imageSize.d;
        VkImage vkImage2 = this.k1;
        if (vkImage2 != null) {
            float f = image2.b;
            float f2 = image2.c;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                vkImage2.setAspectRatio(f / f2);
            }
        }
        VkImage vkImage3 = this.k1;
        if (vkImage3 != null) {
            vkImage3.o0(image2.d, null);
        }
    }

    public final void fo(MyTargetBrandLiftSurvey.Question question, List<MyTargetBrandLiftSurvey.Question> list) {
        VkText vkText = this.i1;
        if (vkText != null) {
            vkText.setText(question.c);
        }
        VkText vkText2 = this.j1;
        if (vkText2 != null) {
            String str = null;
            if (list.size() > 1) {
                Context mo2getContext = mo2getContext();
                if (mo2getContext != null) {
                    str = mo2getContext.getString(R.string.bls_subtitle_many, Integer.valueOf(list.indexOf(question) + 1), Integer.valueOf(list.size()));
                }
            } else {
                Context mo2getContext2 = mo2getContext();
                if (mo2getContext2 != null) {
                    str = mo2getContext2.getString(R.string.bls_subtitle_one);
                }
            }
            vkText2.setText(str);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Intent intent = new Intent("com.vkontakte.android.ACTION_AD_SAVE_SELECTED_BLS_ANSWERS");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.p1.entrySet()) {
            bundle.putStringArrayList((String) entry.getKey(), new ArrayList<>((List) entry.getValue()));
        }
        intent.putExtra("ad_bls_result", bundle);
        Bundle bundle2 = this.f1;
        Integer d = bundle2 != null ? bo8.d(bundle2, "ADS_ENTRY_HASH") : null;
        Bundle bundle3 = this.f1;
        NewsEntry newsEntry = bundle3 != null ? (NewsEntry) bundle3.getParcelable("ADS_NEWS_ITEM") : null;
        if (d == null) {
            if (newsEntry != null) {
                intent.putExtra("ad_entry", newsEntry);
            }
            super.onDestroyView();
        }
        intent.putExtra("ad_entry_hash", d.intValue());
        Context context = e43.a;
        n2i0.a(context != null ? context : null, hf8.a, intent);
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[LOOP:1: B:51:0x0146->B:53:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dialog yn(Bundle bundle) {
        MyTargetBrandLiftSurvey.Question question;
        LinearLayout linearLayout;
        int i;
        VkPlaceholder vkPlaceholder;
        VkPlaceholder vkPlaceholder2;
        Dialog yn = super.yn(bundle);
        MyTargetBrandLiftSurvey Yn = Yn();
        if (Yn != null) {
            List<MyTargetBrandLiftSurvey.Question> list = Yn.b;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (question = (MyTargetBrandLiftSurvey.Question) j5g.a0(list)) != null) {
                Bundle bundle2 = this.f1;
                Serializable serializable = bundle2 != null ? bundle2.getSerializable("PRESELECTED_ANSWERS") : null;
                Map map = serializable instanceof Map ? (Map) serializable : null;
                if (map != null) {
                    LinkedHashMap linkedHashMap = this.p1;
                    linkedHashMap.clear();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), new ArrayList((List) entry.getValue()));
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                }
                this.g1 = (VkPlaceholder) yn.findViewById(R.id.finished_placeholder);
                this.h1 = (LinearLayout) yn.findViewById(R.id.page_container);
                this.i1 = (VkText) yn.findViewById(R.id.tv_question);
                this.j1 = (VkText) yn.findViewById(R.id.tv_question_subhead);
                VkImage vkImage = (VkImage) yn.findViewById(R.id.question_image);
                this.k1 = vkImage;
                if (vkImage != null) {
                    vkImage.setCornerRadius(cn70.c(8));
                }
                this.l1 = (LinearLayout) yn.findViewById(R.id.answers_container);
                this.m1 = (MyTargetAdSurveyButtonsView) yn.findViewById(R.id.buttons_container);
                LinearLayout linearLayout2 = this.h1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(4);
                }
                VkPlaceholder vkPlaceholder3 = this.g1;
                if (vkPlaceholder3 != null) {
                    vkPlaceholder3.setVisibility(8);
                }
                MyTargetBrandLiftSurvey Yn2 = Yn();
                if (Yn2 != null) {
                    List<MyTargetBrandLiftSurvey.Question> list2 = Yn2.b;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null && (linearLayout = this.h1) != null) {
                        Object parent = linearLayout.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Integer valueOf = view != null ? Integer.valueOf(view.getWidth()) : null;
                        if (valueOf != null) {
                            if (valueOf.intValue() <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                i = valueOf.intValue();
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i2 = 0;
                                for (MyTargetBrandLiftSurvey.Question question2 : list2) {
                                    fo(question2, list2);
                                    eo(question2);
                                    bo(question2);
                                    co(question2, list2);
                                    linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
                                    i2 = Math.max(i2, linearLayout.getMeasuredHeight());
                                }
                                linearLayout.setMinimumHeight(i2);
                                linearLayout.requestLayout();
                                awt0.u(linearLayout, true);
                                vkPlaceholder = this.g1;
                                if (vkPlaceholder != null) {
                                    vkPlaceholder.setMinimumHeight(i2);
                                }
                                vkPlaceholder2 = this.g1;
                                if (vkPlaceholder2 != null) {
                                    vkPlaceholder2.requestLayout();
                                }
                            }
                        }
                        i = linearLayout.getResources().getDisplayMetrics().widthPixels;
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i22 = 0;
                        while (r9.hasNext()) {
                        }
                        linearLayout.setMinimumHeight(i22);
                        linearLayout.requestLayout();
                        awt0.u(linearLayout, true);
                        vkPlaceholder = this.g1;
                        if (vkPlaceholder != null) {
                        }
                        vkPlaceholder2 = this.g1;
                        if (vkPlaceholder2 != null) {
                        }
                    }
                }
                VkPlaceholder vkPlaceholder4 = this.g1;
                if (vkPlaceholder4 != null) {
                    vkPlaceholder4.setVisibility(8);
                    vkPlaceholder4.setWithPaddings(false);
                    vkPlaceholder4.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
                    vkPlaceholder4.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.bls_title_finished)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.bls_description_finished))));
                }
                fo(question, list);
                eo(question);
                bo(question);
                co(question, list);
            }
        }
        return yn;
    }
}
