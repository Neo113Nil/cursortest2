package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vk.auth.entername.EnterProfileContract$BirthdayErrorType;
import com.vk.auth.entername.EnterProfileContract$FieldTypes;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.entername.RequiredNameType;
import com.vk.auth.screendata.EnterProfileScreenData;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkAuthExtendedEditText;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzw;
import xsna.qht;

/* compiled from: EnterProfileFragment.kt */
/* loaded from: classes15.dex */
public class opp extends a66<hpp> implements jpp {
    public static final kpp T = new kpp();
    public static final bpn0 U = new bpn0(new cu1(11));
    public TextView A;
    public TextView B;
    public ImageView C;
    public View D;
    public boolean I;
    public VKImageController<? extends View> J;
    public View K;
    public EnterProfileContract$BirthdayErrorType L;
    public e68 R;
    public View s;
    public VkAuthErrorStatedEditText t;
    public VkAuthErrorStatedEditText u;
    public View v;
    public TextView w;
    public qht x;
    public VkAuthErrorStatedEditText y;
    public VkAuthExtendedEditText z;
    public boolean E = true;
    public boolean F = true;
    public VkGender G = VkGender.UNDEFINED;
    public RequiredNameType H = RequiredNameType.WITHOUT_NAME;
    public boolean M = true;
    public SimpleDate N = SimpleDate.e.getSTUB();
    public String O = "";
    public final bpn0 P = new bpn0(new ob0(9));
    public final bpn0 Q = new bpn0(new com.vk.movika.tools.controls.seekbar.n(19));
    public final npp S = new InputFilter() { // from class: xsna.npp
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            kpp kppVar = opp.T;
            int length = charSequence.length() + spanned.length();
            opp oppVar = opp.this;
            if (length <= 10 || !drm0.N(oppVar.O)) {
                if (drm0.N(charSequence) && !drm0.N(oppVar.O)) {
                    oppVar.An();
                    return "";
                }
                if (drm0.N(charSequence) || drm0.N(oppVar.O) || charSequence.length() == oppVar.O.length()) {
                    if (!drm0.N(charSequence) && rl3.G((Integer[]) opp.U.getValue(), Integer.valueOf(i3)) && charSequence.charAt(0) != '.' && Character.isDigit(charSequence.charAt(0))) {
                        return "." + ((Object) charSequence);
                    }
                    if (!drm0.N(charSequence) && rl3.G((Integer[]) opp.U.getValue(), Integer.valueOf(i3)) && charSequence.charAt(0) == '.') {
                        return ".";
                    }
                    if (drm0.N(charSequence) || Character.isDigit(charSequence.charAt(0))) {
                        return charSequence;
                    }
                }
            }
            return "";
        }
    };

    /* compiled from: EnterProfileFragment.kt */
    public static final class a {
        public static Bundle a(EnterProfileScreenData enterProfileScreenData) {
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("requiredNameType", enterProfileScreenData.b);
            bundle.putBoolean("needGender", enterProfileScreenData.c);
            bundle.putBoolean("needBirthday", enterProfileScreenData.d);
            bundle.putBoolean("isAdditionalSignUp", enterProfileScreenData.e);
            return bundle;
        }
    }

    /* compiled from: EnterProfileFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RequiredNameType.values().length];
            try {
                iArr[RequiredNameType.FULL_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequiredNameType.WITHOUT_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequiredNameType.FIRST_AND_LAST_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnterProfileContract$FieldTypes.values().length];
            try {
                iArr2[EnterProfileContract$FieldTypes.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnterProfileContract$FieldTypes.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnterProfileContract$FieldTypes.BIRTHDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnterProfileContract$FieldTypes.GENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: EnterProfileFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<String> {
        @Override // xsna.gzs
        public final String invoke() {
            VkGender vkGender = ((opp) this.receiver).G;
            return vkGender == VkGender.MALE ? "2" : vkGender == VkGender.FEMALE ? "1" : "0";
        }
    }

    public static void zn(VkAuthErrorStatedEditText vkAuthErrorStatedEditText) {
        vkAuthErrorStatedEditText.setVisibility(0);
        int b2 = l8g.b(0.64f);
        vkAuthErrorStatedEditText.getBackground().setAlpha(b2);
        vkAuthErrorStatedEditText.setHint(vkAuthErrorStatedEditText.getText());
        vkAuthErrorStatedEditText.setTextColor(vkAuthErrorStatedEditText.getHintTextColors().withAlpha(b2));
        vkAuthErrorStatedEditText.setEnabled(false);
    }

    public final void An() {
        String w0 = erm0.w0(1, this.N.toString());
        this.N = SimpleDate.e.getSTUB();
        this.O = "";
        Cn(w0);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setSelection(w0.length());
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(false);
        }
    }

    public final void Bn(boolean z) {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setVisibility(z ? 0 : 8);
        VkAuthExtendedEditText vkAuthExtendedEditText = this.z;
        (vkAuthExtendedEditText != null ? vkAuthExtendedEditText : null).setVisibility(z ? 0 : 8);
        TextView textView = this.B;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void Cn(String str) {
        boolean z = this.M;
        this.M = false;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setText(str);
        this.M = z;
    }

    public final void Dn(EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType) {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(true);
        TextView textView = this.A;
        if (textView == null) {
            textView = null;
        }
        textView.setText(enterProfileContract$BirthdayErrorType.h());
        TextView textView2 = this.A;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setVisibility(0);
        this.L = null;
    }

    @Override // xsna.jpp
    public final void E4(gpp gppVar) {
        if (gppVar instanceof EnterProfileContract$BirthdayErrorType) {
            if (yn()) {
                Dn((EnterProfileContract$BirthdayErrorType) gppVar);
                return;
            } else {
                this.L = (EnterProfileContract$BirthdayErrorType) gppVar;
                return;
            }
        }
        if (gppVar instanceof ipp) {
            ipp ippVar = (ipp) gppVar;
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
            if (vkAuthErrorStatedEditText == null) {
                vkAuthErrorStatedEditText = null;
            }
            vkAuthErrorStatedEditText.setErrorState(true);
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
            if (vkAuthErrorStatedEditText2 == null) {
                vkAuthErrorStatedEditText2 = null;
            }
            vkAuthErrorStatedEditText2.setErrorState(true);
            TextView textView = this.w;
            if (textView == null) {
                textView = null;
            }
            textView.setText(ippVar.b);
            TextView textView2 = this.w;
            (textView2 != null ? textView2 : null).setVisibility(0);
            View view = this.v;
            if (view != null) {
                view.setBackgroundColor(e3m.f(R.attr.vk_ui_stroke_negative, requireContext()));
            }
        }
    }

    @Override // xsna.jpp
    public final io.reactivex.rxjava3.internal.operators.observable.j1 Fa() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        gzw.a aVar = new gzw.a(new qno0(vkAuthErrorStatedEditText));
        az azVar = new az(new wze(this, 22), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.i0(aVar.E(azVar, lVar, kVar, kVar), new fq1(new bz(21), 14)).U(new lh3(new dz(25), 15));
    }

    @Override // xsna.jpp
    public final io.reactivex.rxjava3.internal.operators.observable.j1 Gb() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        return new gzw.a(new qno0(vkAuthErrorStatedEditText)).U(new ps2(new com.vk.movika.sdk.base.observable.i(29), 20));
    }

    @Override // xsna.jpp
    public final void Tb(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int i = b.$EnumSwitchMapping$1[((EnterProfileContract$FieldTypes) it.next()).ordinal()];
            if (i == 1) {
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
                zn(vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null);
            } else if (i == 2) {
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
                zn(vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null);
            } else if (i == 3) {
                Bn(true);
                View view = this.D;
                if (view != null) {
                    view.setEnabled(false);
                }
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText3 = this.y;
                zn(vkAuthErrorStatedEditText3 != null ? vkAuthErrorStatedEditText3 : null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                qht qhtVar = this.x;
                qht qhtVar2 = qhtVar != null ? qhtVar : null;
                qhtVar2.a.setVisibility(0);
                qhtVar2.b.setVisibility(0);
                qhtVar2.c.setEnabled(false);
                qhtVar2.d.setEnabled(false);
            }
        }
    }

    @Override // xsna.jpp
    public final void W0(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(!z);
        }
    }

    @Override // xsna.a66, com.vk.registration.funnels.c
    public final List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        opp oppVar;
        ArrayList arrayList = new ArrayList(4);
        if (this.E) {
            oppVar = this;
            arrayList.add(new Pair(TrackingElement.Registration.SEX, new c(0, oppVar, opp.class, "genderType", "genderType()Ljava/lang/String;", 0)));
        } else {
            oppVar = this;
        }
        int i = b.$EnumSwitchMapping$0[oppVar.H.ordinal()];
        if (i == 1 || i == 3) {
            arrayList.add(new Pair(TrackingElement.Registration.FIRST_NAME, new z4f(this, 19)));
            arrayList.add(new Pair(TrackingElement.Registration.LAST_NAME, new yqf(this, 15)));
        }
        View view = oppVar.K;
        if (view != null) {
            arrayList.add(new Pair(TrackingElement.Registration.PHOTO, new zqf(view, 18)));
        }
        if (oppVar.F) {
            arrayList.add(new Pair(TrackingElement.Registration.BDAY, new b1j(this, 14)));
        }
        return arrayList;
    }

    @Override // xsna.jpp
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c8() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.u;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        return new gzw.a(new qno0(vkAuthErrorStatedEditText)).U(new nb(new gzn(2), 14));
    }

    @Override // xsna.jpp
    public final void fc(com.vk.auth.entername.a aVar) {
        Uri uri = aVar.e;
        SimpleDate simpleDate = aVar.c;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        String str = aVar.a;
        if (!epx.f(vkAuthErrorStatedEditText.getText().toString(), str)) {
            vkAuthErrorStatedEditText.setText(str);
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
        if (vkAuthErrorStatedEditText2 == null) {
            vkAuthErrorStatedEditText2 = null;
        }
        String str2 = aVar.b;
        if (!epx.f(vkAuthErrorStatedEditText2.getText().toString(), str2)) {
            vkAuthErrorStatedEditText2.setText(str2);
        }
        if (!epx.f(simpleDate, SimpleDate.e.getSTUB()) && !epx.f(simpleDate, this.N)) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText3 = this.y;
            if (vkAuthErrorStatedEditText3 == null) {
                vkAuthErrorStatedEditText3 = null;
            }
            String simpleDate2 = simpleDate.toString();
            if (!epx.f(vkAuthErrorStatedEditText3.getText().toString(), simpleDate2)) {
                vkAuthErrorStatedEditText3.setText(simpleDate2);
            }
        }
        VKImageController.b a2 = adu0.a(4, requireContext());
        VKImageController<? extends View> vKImageController = this.J;
        if (vKImageController != null) {
            vKImageController.f(uri != null ? uri.toString() : null, a2);
        }
        View view = this.K;
        if (view != null) {
            view.setTag(R.id.vk_tag_extra_analytics_info, Boolean.valueOf(uri != null));
        }
        VkGender vkGender = aVar.d;
        this.G = vkGender;
        qht qhtVar = this.x;
        qht qhtVar2 = qhtVar != null ? qhtVar : null;
        RadioButton radioButton = qhtVar2.d;
        RadioButton radioButton2 = qhtVar2.c;
        int i = qht.a.$EnumSwitchMapping$0[vkGender.ordinal()];
        if (i == 1) {
            radioButton2.setChecked(true);
            return;
        }
        if (i == 2) {
            radioButton.setChecked(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            radioButton2.setChecked(false);
            radioButton.setChecked(false);
        }
    }

    @Override // xsna.jpp
    public final void hn(SimpleDate simpleDate) {
        if (simpleDate.equals(SimpleDate.e.getSTUB())) {
            return;
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        if (simpleDate.equals(SimpleDate.b.a(String.valueOf(vkAuthErrorStatedEditText.getText())))) {
            this.N = simpleDate;
            Context requireContext = requireContext();
            DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
            dateFormatSymbols.setMonths(requireContext.getResources().getStringArray(R.array.vk_months_full));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            Calendar calendar = Calendar.getInstance();
            calendar.set(simpleDate.d, simpleDate.c - 1, simpleDate.b);
            String format = simpleDateFormat.format(new Date(calendar.getTimeInMillis()));
            this.O = format;
            Cn(format);
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.y;
            (vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null).setSelection(this.O.length());
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        this.H = (RequiredNameType) (arguments != null ? arguments.getSerializable("requiredNameType") : null);
        Bundle arguments2 = getArguments();
        this.E = (arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("needGender")) : null).booleanValue();
        Bundle arguments3 = getArguments();
        this.F = (arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("needBirthday")) : null).booleanValue();
        Bundle arguments4 = getArguments();
        this.I = (arguments4 != null ? Boolean.valueOf(arguments4.getBoolean("isAdditionalSignUp")) : null).booleanValue();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_enter_name_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e68 e68Var = this.R;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = view.findViewById(R.id.vk_auth_enter_name_container);
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.name_block_redesign_view_stub);
        viewStub.setLayoutResource(R.layout.vk_auth_enter_profile_name_block_old);
        viewStub.inflate();
        this.t = (VkAuthErrorStatedEditText) view.findViewById(R.id.first_name);
        this.u = (VkAuthErrorStatedEditText) view.findViewById(R.id.last_name);
        this.w = (TextView) view.findViewById(R.id.error_name);
        this.v = view.findViewById(R.id.separator);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        InputFilter[] filters = vkAuthErrorStatedEditText.getFilters();
        kpp kppVar = T;
        vkAuthErrorStatedEditText.setFilters((InputFilter[]) jw5.y(kppVar, filters));
        int i = 26;
        oa01.a(vkAuthErrorStatedEditText, new dsc(this, i));
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
        if (vkAuthErrorStatedEditText2 == null) {
            vkAuthErrorStatedEditText2 = null;
        }
        vkAuthErrorStatedEditText2.setFilters((InputFilter[]) jw5.y(kppVar, vkAuthErrorStatedEditText2.getFilters()));
        oa01.a(vkAuthErrorStatedEditText2, new dsc(this, i));
        qht qhtVar = new qht(view);
        this.x = qhtVar;
        Object obj = this.o;
        q60 q60Var = new q60(1, obj != null ? obj : null, hpp.class, "onGenderSelected", "onGenderSelected(Lcom/vk/superapp/core/api/models/VkGender;)V", 0, 6);
        int i2 = 1;
        qhtVar.c.setOnCheckedChangeListener(new l4g(q60Var, i2));
        qhtVar.d.setOnCheckedChangeListener(new pht(q60Var, 0));
        if (!this.E) {
            qht qhtVar2 = this.x;
            if (qhtVar2 == null) {
                qhtVar2 = null;
            }
            f4m.j(qhtVar2.a);
            f4m.j(qhtVar2.b);
        }
        this.y = (VkAuthErrorStatedEditText) view.findViewById(R.id.enter_birthday);
        this.z = (VkAuthExtendedEditText) view.findViewById(R.id.enter_birthday_container);
        this.A = (TextView) view.findViewById(R.id.error_birthday);
        this.B = (TextView) view.findViewById(R.id.enter_birthday_header);
        this.C = (ImageView) view.findViewById(R.id.enter_birthday_tooltip);
        View findViewById = view.findViewById(R.id.open_calendar);
        this.D = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new nn9(this, 4));
        }
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setOnClickListener(new tkc(this, i2));
        }
        if (!this.F) {
            Bn(false);
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText3 = this.y;
        if (vkAuthErrorStatedEditText3 == null) {
            vkAuthErrorStatedEditText3 = null;
        }
        oa01.a(vkAuthErrorStatedEditText3, new b5h(this, 13));
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText4 = this.y;
        if (vkAuthErrorStatedEditText4 == null) {
            vkAuthErrorStatedEditText4 = null;
        }
        vkAuthErrorStatedEditText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.lpp
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                opp oppVar = opp.this;
                EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType = oppVar.L;
                if (!oppVar.yn() || enterProfileContract$BirthdayErrorType == null) {
                    return;
                }
                oppVar.Dn(enterProfileContract$BirthdayErrorType);
            }
        });
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText5 = this.y;
        if (vkAuthErrorStatedEditText5 == null) {
            vkAuthErrorStatedEditText5 = null;
        }
        vkAuthErrorStatedEditText5.setFilters((InputFilter[]) jw5.y(this.S, vkAuthErrorStatedEditText5.getFilters()));
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(requireContext());
        this.J = create;
        View view2 = ((com.vk.core.ui.image.c) create).getView();
        this.K = view2;
        if (view2 != null) {
            VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.avatar);
            vKReplacerView.a(view2);
            enj.a(vKReplacerView.getBackground(), R.id.layer_icon, e3m.f(R.attr.vk_ui_background_accent, requireContext()));
            jjc.g(view2, new wpg(this, 11));
        }
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setOnClickListener(new yn3(this, 9));
        }
        if (this.H != RequiredNameType.WITHOUT_NAME) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText6 = this.t;
            if (vkAuthErrorStatedEditText6 == null) {
                vkAuthErrorStatedEditText6 = null;
            }
            vkAuthErrorStatedEditText6.addTextChangedListener((com.vk.registration.funnels.d) this.P.getValue());
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText7 = this.u;
            if (vkAuthErrorStatedEditText7 == null) {
                vkAuthErrorStatedEditText7 = null;
            }
            vkAuthErrorStatedEditText7.addTextChangedListener((com.vk.registration.funnels.d) this.Q.getValue());
        }
        int i3 = b.$EnumSwitchMapping$0[this.H.ordinal()];
        if (i3 == 1) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText8 = this.u;
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText9 = vkAuthErrorStatedEditText8 == null ? null : vkAuthErrorStatedEditText8;
            if (vkAuthErrorStatedEditText8 == null) {
                vkAuthErrorStatedEditText8 = null;
            }
            vkAuthErrorStatedEditText9.setHint(getString(R.string.vk_auth_sign_up_optional, vkAuthErrorStatedEditText8.getHint()));
        } else if (i3 == 2) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText10 = this.t;
            if (vkAuthErrorStatedEditText10 == null) {
                vkAuthErrorStatedEditText10 = null;
            }
            f4m.j(vkAuthErrorStatedEditText10);
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText11 = this.u;
            if (vkAuthErrorStatedEditText11 == null) {
                vkAuthErrorStatedEditText11 = null;
            }
            f4m.j(vkAuthErrorStatedEditText11);
        }
        View view3 = this.s;
        if (view3 == null) {
            view3 = null;
        }
        e68 e68Var = new e68(view3);
        efy.a(e68Var);
        this.R = e68Var;
        bpn0 bpn0Var = t65.a;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText12 = this.t;
        if (vkAuthErrorStatedEditText12 == null) {
            vkAuthErrorStatedEditText12 = null;
        }
        t65.a(vkAuthErrorStatedEditText12);
        View findViewById2 = view.findViewById(R.id.help_button);
        if (findViewById2 != null) {
            un().getClass();
            int i4 = 8;
            findViewById2.setVisibility(otu0.a() ? 0 : 8);
            findViewById2.setOnClickListener(new x16(this, i4));
        }
        Object obj2 = this.o;
        ((hpp) (obj2 != null ? obj2 : null)).y0(this);
    }

    @Override // xsna.a66
    public final hpp tn(Bundle bundle) {
        return new EnterProfilePresenter(bundle, this.H, this.E, this.F);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return this.I ? SchemeStatSak$EventScreen.REGISTRATION_INFO_ABOUT_YOURSELF_ADD : SchemeStatSak$EventScreen.REGISTRATION_INFO_ABOUT_YOURSELF;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setEnabled(!z);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
        (vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null).setEnabled(!z);
        View view = this.K;
        if (view != null) {
            view.setEnabled(!z);
        }
    }

    @Override // xsna.a66
    public final void xn() {
        if (this.H == RequiredNameType.WITHOUT_NAME) {
            return;
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.removeTextChangedListener((com.vk.registration.funnels.d) this.P.getValue());
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
        (vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null).removeTextChangedListener((com.vk.registration.funnels.d) this.Q.getValue());
    }

    @Override // xsna.jpp
    public final void yf(EnterProfileContract$FieldTypes enterProfileContract$FieldTypes) {
        int i = b.$EnumSwitchMapping$1[enterProfileContract$FieldTypes.ordinal()];
        if (i == 1) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.t;
            (vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null).setVisibility(0);
            return;
        }
        if (i == 2) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.u;
            (vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null).setVisibility(0);
        } else if (i == 3) {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText3 = this.y;
            (vkAuthErrorStatedEditText3 != null ? vkAuthErrorStatedEditText3 : null).setVisibility(0);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            qht qhtVar = this.x;
            qht qhtVar2 = qhtVar != null ? qhtVar : null;
            qhtVar2.a.setVisibility(0);
            qhtVar2.b.setVisibility(0);
        }
    }

    public final boolean yn() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        Editable text = vkAuthErrorStatedEditText.getText();
        if (text != null && text.length() == 10) {
            return true;
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = this.y;
        return !(vkAuthErrorStatedEditText2 != null ? vkAuthErrorStatedEditText2 : null).isFocused();
    }
}
