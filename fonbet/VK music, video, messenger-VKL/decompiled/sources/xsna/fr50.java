package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyFadeView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: MyTargetInternalNativeAdSurveyViewHolder.kt */
/* loaded from: classes4.dex */
public final class fr50 extends rp6<MyTargetInternalNativeAdBlsUiDto, MyTargetNativeAdEntry> {
    public static final /* synthetic */ int O = 0;
    public final FrameLayout E;
    public final MyTargetAdSurveyPageView F;
    public final VkPlaceholder G;
    public final MyTargetAdSurveyFadeView H;
    public final b I;
    public final Object J;
    public cjx K;
    public int L;
    public ValueAnimator M;
    public MyTargetNativeAdEntry N;

    /* compiled from: MyTargetInternalNativeAdSurveyViewHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            fr50 fr50Var = fr50.this;
            cjx cjxVar = fr50Var.K;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.q(fr50Var.I);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            fr50 fr50Var = fr50.this;
            cjx cjxVar = fr50Var.K;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.f(fr50Var.I);
        }
    }

    /* compiled from: MyTargetInternalNativeAdSurveyViewHolder.kt */
    public static final class b implements vix {
        public final FrameLayout b;

        public b(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return this.b;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }
    }

    /* compiled from: MyTargetInternalNativeAdSurveyViewHolder.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MyTargetInternalNativeAdBlsUiDto.QuestionUiDto.QuestionType.values().length];
            try {
                iArr[MyTargetInternalNativeAdBlsUiDto.QuestionUiDto.QuestionType.ONE_ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyTargetInternalNativeAdBlsUiDto.QuestionUiDto.QuestionType.MULTIPLE_ANSWERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.values().length];
            try {
                iArr2[MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.USER_ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.OTHER_ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MyTargetInternalNativeAdBlsUiDto.AnswerUiDto.AnswerType.NOTHING_ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public fr50(ViewGroup viewGroup) {
        super(R.layout.news_internal_native_ad_bls_view_holder, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.bls_container);
        this.E = frameLayout;
        this.F = (MyTargetAdSurveyPageView) this.itemView.findViewById(R.id.page_container);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView.findViewById(R.id.finished_placeholder);
        this.G = vkPlaceholder;
        this.H = (MyTargetAdSurveyFadeView) this.itemView.findViewById(R.id.fade_container);
        this.I = new b(frameLayout);
        this.J = msy.a(LazyThreadSafetyMode.NONE, new x550(this, 3));
        this.itemView.addOnAttachStateChangeListener(new a());
        vkPlaceholder.setWithPaddings(false);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.bls_title_finished)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.bls_description_finished))));
        vkPlaceholder.setOnClickListener(new dr50());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MyTargetAdSurveyPageView.Page b7(MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto) {
        int i;
        njw njwVar;
        int i2;
        MyTargetAdSurveyPageView.Page.QuestionType questionType;
        Iterator it;
        MyTargetAdSurveyPageView.Page.Answer.Type type;
        boolean z;
        boolean z2;
        Set<String> set;
        njw njwVar2;
        MyTargetInternalNativeAdBlsUiDto.a aVar = myTargetInternalNativeAdBlsUiDto.j;
        MyTargetNativeAdEntry myTargetNativeAdEntry = myTargetInternalNativeAdBlsUiDto.i;
        gjx gjxVar = myTargetInternalNativeAdBlsUiDto.h;
        boolean z3 = aVar instanceof MyTargetInternalNativeAdBlsUiDto.a.b;
        MyTargetInternalNativeAdBlsUiDto.a.b bVar = z3 ? (MyTargetInternalNativeAdBlsUiDto.a.b) aVar : null;
        if (bVar == null) {
            return null;
        }
        boolean z4 = bVar.a;
        MyTargetInternalNativeAdBlsUiDto.QuestionUiDto questionUiDto = bVar.b;
        List<Image> list = questionUiDto.d;
        List<MyTargetInternalNativeAdBlsUiDto.AnswerUiDto> list2 = questionUiDto.e;
        MyTargetInternalNativeAdBlsUiDto.a.b bVar2 = z3 ? (MyTargetInternalNativeAdBlsUiDto.a.b) aVar : null;
        if (bVar2 != null) {
            wjz0 content = gjxVar.getContent();
            ArrayList arrayList = (content == null || (njwVar = content.a.b0) == null) ? null : new ArrayList((ArrayList) njwVar.c);
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (epx.f(((xmx) it2.next()).w(), bVar2.b.a)) {
                        break;
                    }
                    i3++;
                }
                i = i3;
                wjz0 content2 = gjxVar.getContent();
                int size = (content2 != null || (njwVar2 = content2.a.b0) == null) ? 0 : new ArrayList((ArrayList) njwVar2.c).size();
                int size2 = (z4 || list.isEmpty()) ? !z4 ? 4 : list2.size() : 0;
                String str = questionUiDto.a;
                i2 = c.$EnumSwitchMapping$0[questionUiDto.b.ordinal()];
                if (i2 != 1) {
                    questionType = MyTargetAdSurveyPageView.Page.QuestionType.SINGLE;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    questionType = MyTargetAdSurveyPageView.Page.QuestionType.MULTIPLE;
                }
                String str2 = questionUiDto.c;
                List<MyTargetInternalNativeAdBlsUiDto.AnswerUiDto> list3 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    MyTargetInternalNativeAdBlsUiDto.AnswerUiDto answerUiDto = (MyTargetInternalNativeAdBlsUiDto.AnswerUiDto) it.next();
                    MyTargetNativeAdEntry.b bVar3 = myTargetNativeAdEntry.E;
                    String str3 = bVar3 != null ? bVar3.a : null;
                    String str4 = answerUiDto.a;
                    List<Image> list4 = answerUiDto.d;
                    MyTargetAdSurveyPageView.Page.QuestionType questionType2 = questionType;
                    String str5 = answerUiDto.c;
                    int i4 = c.$EnumSwitchMapping$1[answerUiDto.b.ordinal()];
                    Iterator it3 = it;
                    if (i4 == 1) {
                        type = MyTargetAdSurveyPageView.Page.Answer.Type.USER;
                    } else if (i4 == 2) {
                        type = MyTargetAdSurveyPageView.Page.Answer.Type.OTHER;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = MyTargetAdSurveyPageView.Page.Answer.Type.NOTHING;
                    }
                    MyTargetAdSurveyPageView.Page.Answer.Type type2 = type;
                    MyTargetNativeAdEntry.b bVar4 = myTargetNativeAdEntry.E;
                    if (bVar4 == null || (set = bVar4.c.get(str3)) == null) {
                        z = true;
                    } else {
                        z = true;
                        if (set.contains(answerUiDto.a)) {
                            z2 = true;
                            arrayList2.add(new MyTargetAdSurveyPageView.Page.Answer(str4, list4, str5, z2, type2));
                            questionType = questionType2;
                            it = it3;
                        }
                    }
                    z2 = false;
                    arrayList2.add(new MyTargetAdSurveyPageView.Page.Answer(str4, list4, str5, z2, type2));
                    questionType = questionType2;
                    it = it3;
                }
                return new MyTargetAdSurveyPageView.Page(str, questionType, str2, list, j5g.H0(arrayList2, size2), i, size, bVar.a, list2.size());
            }
        }
        i = 0;
        wjz0 content22 = gjxVar.getContent();
        if (content22 != null) {
        }
        if (z4) {
        }
        String str6 = questionUiDto.a;
        i2 = c.$EnumSwitchMapping$0[questionUiDto.b.ordinal()];
        if (i2 != 1) {
        }
        String str22 = questionUiDto.c;
        List<MyTargetInternalNativeAdBlsUiDto.AnswerUiDto> list32 = list2;
        ArrayList arrayList22 = new ArrayList(c5g.u(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        return new MyTargetAdSurveyPageView.Page(str6, questionType, str22, list, j5g.H0(arrayList22, size2), i, size, bVar.a, list2.size());
    }

    @Override // xsna.qi6
    public final void I6() {
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.M = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto) {
        MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto2 = myTargetInternalNativeAdBlsUiDto;
        MyTargetNativeAdEntry myTargetNativeAdEntry = myTargetInternalNativeAdBlsUiDto2.i;
        fkz0 b2 = ((yix) this.J.getValue()).b(myTargetInternalNativeAdBlsUiDto2.h);
        this.K = b2;
        b2.q(this.I);
        MyTargetInternalNativeAdBlsUiDto.a aVar = myTargetInternalNativeAdBlsUiDto2.j;
        boolean z = aVar instanceof MyTargetInternalNativeAdBlsUiDto.a.b;
        VkPlaceholder vkPlaceholder = this.G;
        MyTargetAdSurveyFadeView myTargetAdSurveyFadeView = this.H;
        MyTargetAdSurveyPageView myTargetAdSurveyPageView = this.F;
        if (z) {
            f4m.j(vkPlaceholder);
            myTargetAdSurveyPageView.setVisibility(0);
            if (((MyTargetInternalNativeAdBlsUiDto.a.b) aVar).a) {
                this.itemView.setOnClickListener(new mmb(3, this, myTargetInternalNativeAdBlsUiDto2));
                myTargetAdSurveyPageView.setOnClickListener(new te5(4, this, myTargetInternalNativeAdBlsUiDto2));
                MyTargetAdSurveyPageView.Page b7 = b7(myTargetInternalNativeAdBlsUiDto2);
                if (b7 != null) {
                    myTargetAdSurveyPageView.setUp(b7);
                    ij8 ij8Var = new ij8(23, this, myTargetInternalNativeAdBlsUiDto2);
                    myTargetAdSurveyPageView.h = null;
                    myTargetAdSurveyPageView.i = null;
                    myTargetAdSurveyPageView.j = null;
                    myTargetAdSurveyPageView.k = ij8Var;
                    myTargetAdSurveyPageView.setOnCheckedChangeListener(null);
                    myTargetAdSurveyPageView.setCheckboxesEnabled(false);
                    myTargetAdSurveyFadeView.setUpButtonText(enj.f(R.plurals.bls_button_open_modal, b7.i, this.itemView.getContext()));
                    myTargetAdSurveyFadeView.setUpButtonClickListener(new com.vk.im.engine.commands.messages.a(29, this, myTargetInternalNativeAdBlsUiDto2));
                }
                myTargetAdSurveyFadeView.setVisibility(0);
            } else {
                this.itemView.setOnClickListener(new dr50());
                myTargetAdSurveyPageView.setOnClickListener(new dr50());
                MyTargetAdSurveyPageView.Page b72 = b7(myTargetInternalNativeAdBlsUiDto2);
                if (b72 != null) {
                    myTargetAdSurveyPageView.setUp(b72);
                    mp3 mp3Var = new mp3(21, this, myTargetInternalNativeAdBlsUiDto2);
                    g84 g84Var = new g84(21, this, myTargetInternalNativeAdBlsUiDto2);
                    ng3 ng3Var = new ng3(27, this, myTargetInternalNativeAdBlsUiDto2);
                    myTargetAdSurveyPageView.h = mp3Var;
                    myTargetAdSurveyPageView.i = g84Var;
                    myTargetAdSurveyPageView.j = ng3Var;
                    myTargetAdSurveyPageView.k = null;
                    myTargetAdSurveyPageView.setOnCheckedChangeListener(new er50(this, myTargetInternalNativeAdBlsUiDto2, b72, myTargetAdSurveyPageView));
                    myTargetAdSurveyPageView.setCheckboxesEnabled(true);
                }
                f4m.j(myTargetAdSurveyFadeView);
            }
        } else {
            if (!(aVar instanceof MyTargetInternalNativeAdBlsUiDto.a.C1368a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(myTargetAdSurveyFadeView);
            f4m.j(myTargetAdSurveyPageView);
            vkPlaceholder.setVisibility(0);
        }
        if (!epx.f(myTargetNativeAdEntry, this.N)) {
            this.L = 0;
        }
        this.E.post(new qb3(this, 7));
        this.N = myTargetNativeAdEntry;
    }
}
