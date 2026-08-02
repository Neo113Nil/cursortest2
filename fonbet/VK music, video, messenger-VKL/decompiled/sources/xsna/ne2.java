package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ne2;
import xsna.yqx0;

/* compiled from: AndroidVkUiEditText.kt */
/* loaded from: classes4.dex */
public final class ne2 {

    /* compiled from: AndroidVkUiEditText.kt */
    @b6l(c = "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.AndroidVkUiEditTextKt$AndroidVkUiEditText$4$1", f = "AndroidVkUiEditText.kt", l = {71}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $imeIsVisible;
        final /* synthetic */ wh50<tny> $inputCoordinates$delegate;
        final /* synthetic */ wh50<Boolean> $isFocused$delegate;
        final /* synthetic */ gzs<s3q0> $onFocusWithKeyboard;
        final /* synthetic */ yc8 $requester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, yc8 yc8Var, gzs<s3q0> gzsVar, wh50<Boolean> wh50Var, wh50<tny> wh50Var2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$imeIsVisible = z;
            this.$requester = yc8Var;
            this.$onFocusWithKeyboard = gzsVar;
            this.$isFocused$delegate = wh50Var;
            this.$inputCoordinates$delegate = wh50Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$imeIsVisible, this.$requester, this.$onFocusWithKeyboard, this.$isFocused$delegate, this.$inputCoordinates$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$imeIsVisible && this.$isFocused$delegate.getValue().booleanValue()) {
                    yc8 yc8Var = this.$requester;
                    tny value = this.$inputCoordinates$delegate.getValue();
                    zhf0 e = value != null ? p490.e(0L, pli.w(value.a())) : null;
                    this.label = 1;
                    if (yc8Var.a(e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onFocusWithKeyboard.invoke();
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class b implements kgn {
        public final /* synthetic */ View a;
        public final /* synthetic */ ke2 b;

        public b(View view, ke2 ke2Var) {
            this.a = view;
            this.b = ke2Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final boolean z, final String str2, final q630 q630Var, final String str3, final String str4, boolean z2, final int i, final String str5, final String str6, final izs<? super String, s3q0> izsVar, final gzs<s3q0> gzsVar, Drawable drawable, CharSequence charSequence, boolean z3, gzs<s3q0> gzsVar2, Integer num, String str7, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a aVar2;
        final Drawable drawable2;
        final boolean z5;
        final gzs<s3q0> gzsVar3;
        final Integer num2;
        final String str8;
        final boolean z6;
        final CharSequence charSequence2;
        androidx.compose.runtime.f s;
        boolean z7;
        final gzs<s3q0> gzsVar4;
        boolean z8;
        boolean z9;
        yc8 yc8Var;
        Object obj;
        int i15;
        int i16;
        int i17;
        CharSequence charSequence3;
        Integer num3;
        boolean z10;
        androidx.compose.runtime.a M = aVar.M(1434698232);
        if ((i2 & 6) == 0) {
            i5 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= M.J(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= M.J(str3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i6 = 131072;
            i5 |= M.J(str4) ? 131072 : 65536;
        } else {
            i6 = 131072;
        }
        int i18 = i4 & 64;
        if (i18 != 0) {
            i5 |= 1572864;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 1572864) == 0) {
                i5 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        if ((i2 & 12582912) == 0) {
            i5 |= M.o(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= M.J(str5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= M.J(str6) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (M.y(izsVar) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= M.y(gzsVar) ? 32 : 16;
        }
        int i19 = i7;
        int i20 = i4 & 4096;
        if (i20 != 0) {
            i8 = i19 | 384;
        } else if ((i3 & 384) == 0) {
            i8 = i19 | (M.y(drawable) ? 256 : 128);
        } else {
            i8 = i19;
        }
        int i21 = i4 & 8192;
        if (i21 != 0) {
            i9 = i8 | 3072;
        } else {
            int i22 = i8;
            if ((i3 & 3072) == 0) {
                i9 = i22 | (M.y(charSequence) ? 2048 : 1024);
            } else {
                i9 = i22;
            }
        }
        int i23 = i4 & 16384;
        if (i23 != 0) {
            i10 = i9 | 24576;
        } else {
            i10 = i9;
            if ((i3 & 24576) == 0) {
                i10 |= M.l(z3) ? 16384 : 8192;
                i11 = i4 & 32768;
                if (i11 == 0) {
                    i10 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    i10 |= M.y(gzsVar2) ? i6 : 65536;
                }
                i12 = i4 & 65536;
                if (i12 == 0) {
                    i10 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i10 |= M.J(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i13 = i4 & i6;
                if (i13 == 0) {
                    i10 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i10 |= M.J(str7) ? 8388608 : 4194304;
                }
                i14 = i10;
                if (M.t(i5 & 1, (i5 & 306783379) == 306783378 || (4793491 & i14) != 4793490)) {
                    aVar2 = M;
                    aVar2.h();
                    drawable2 = drawable;
                    z5 = z3;
                    gzsVar3 = gzsVar2;
                    num2 = num;
                    str8 = str7;
                    z6 = z4;
                    charSequence2 = charSequence;
                } else {
                    boolean z11 = i18 != 0 ? false : z4;
                    final Drawable drawable3 = i20 != 0 ? null : drawable;
                    final CharSequence charSequence4 = i21 != 0 ? "" : charSequence;
                    final boolean z12 = i23 != 0 ? false : z3;
                    Object obj2 = a.C0011a.a;
                    if (i11 != 0) {
                        Object x = M.x();
                        if (x == obj2) {
                            z7 = z11;
                            x = new r(2);
                            M.R(x);
                        } else {
                            z7 = z11;
                        }
                        gzsVar4 = (gzs) x;
                    } else {
                        z7 = z11;
                        gzsVar4 = gzsVar2;
                    }
                    Integer num4 = i12 != 0 ? null : num;
                    boolean z13 = z7;
                    String str9 = i13 != 0 ? "" : str7;
                    Integer num5 = num4;
                    if (androidx.compose.runtime.b.d()) {
                        z8 = z13;
                        androidx.compose.runtime.b.f(1434698232, i5, i14, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.AndroidVkUiEditText (AndroidVkUiEditText.kt:62)");
                    } else {
                        z8 = z13;
                    }
                    Object x2 = M.x();
                    if (x2 == obj2) {
                        x2 = new bd8();
                        M.R(x2);
                    }
                    yc8 yc8Var2 = (yc8) x2;
                    Object x3 = M.x();
                    if (x3 == obj2) {
                        x3 = androidx.compose.runtime.k.b(null);
                        M.R(x3);
                    }
                    final wh50 wh50Var = (wh50) x3;
                    final View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1873571424, 6, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:295)");
                    }
                    WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                    Boolean bool = (Boolean) ((zak0) yqx0.a.c(M).c.d).getValue();
                    boolean booleanValue = bool.booleanValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x4 = M.x();
                    if (x4 == obj2) {
                        x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        M.R(x4);
                    }
                    final wh50 wh50Var2 = (wh50) x4;
                    Boolean bool2 = (Boolean) wh50Var2.getValue();
                    bool2.getClass();
                    boolean l = M.l(booleanValue) | M.y(yc8Var2);
                    int i24 = i14 & 112;
                    boolean z14 = (i24 == 32) | l;
                    Object x5 = M.x();
                    if (z14 || x5 == obj2) {
                        x5 = new a(booleanValue, yc8Var2, gzsVar, wh50Var2, wh50Var, null);
                        z9 = booleanValue;
                        yc8Var = yc8Var2;
                        M.R(x5);
                    } else {
                        z9 = booleanValue;
                        yc8Var = yc8Var2;
                    }
                    bap.f(bool, bool2, (wzs) x5, M, 0);
                    Object x6 = M.x();
                    if (x6 == obj2) {
                        x6 = androidx.compose.runtime.i.a(0);
                        M.R(x6);
                    }
                    final rg50 rg50Var = (rg50) x6;
                    Object x7 = M.x();
                    if (x7 == obj2) {
                        x7 = bap.j(EmptyCoroutineContext.b, M);
                        M.R(x7);
                    }
                    final yvj yvjVar = (yvj) x7;
                    boolean y = M.y(view) | M.l(z9) | M.y(yvjVar) | M.y(yc8Var) | (i24 == 32);
                    Object x8 = M.x();
                    if (y || x8 == obj2) {
                        final boolean z15 = z9;
                        final yc8 yc8Var3 = yc8Var;
                        x8 = new izs() { // from class: xsna.ee2
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.ke2] */
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                final View view2 = view;
                                final boolean z16 = z15;
                                final yvj yvjVar2 = yvjVar;
                                final yc8 yc8Var4 = yc8Var3;
                                final gzs gzsVar5 = gzsVar;
                                final rg50 rg50Var2 = rg50Var;
                                final wh50 wh50Var3 = wh50Var2;
                                final wh50 wh50Var4 = wh50Var;
                                ?? r0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.ke2
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                    public final void onGlobalLayout() {
                                        Rect rect = new Rect();
                                        View view3 = view2;
                                        view3.getWindowVisibleDisplayFrame(rect);
                                        int height = view3.getRootView().getHeight() - rect.bottom;
                                        rg50 rg50Var3 = rg50Var2;
                                        if (rg50Var3.getIntValue() != height) {
                                            rg50Var3.C(height);
                                            boolean booleanValue2 = ((Boolean) wh50Var3.getValue()).booleanValue();
                                            tny tnyVar = (tny) wh50Var4.getValue();
                                            if (z16 && booleanValue2) {
                                                myc0.h(yvjVar2, null, null, new pe2(yc8Var4, tnyVar, null), 3);
                                                gzsVar5.invoke();
                                            }
                                        }
                                    }
                                };
                                view2.getViewTreeObserver().addOnGlobalLayoutListener(r0);
                                return new ne2.b(view2, r0);
                            }
                        };
                        wh50Var2 = wh50Var2;
                        wh50Var = wh50Var;
                        M.R(x8);
                    }
                    bap.c(view, (izs) x8, M, 0);
                    boolean l2 = M.l(z9) | M.y(yvjVar) | M.y(yc8Var) | (i24 == 32);
                    Object x9 = M.x();
                    if (l2 || x9 == obj2) {
                        final yc8 yc8Var4 = yc8Var;
                        final boolean z16 = z9;
                        final wh50 wh50Var3 = wh50Var2;
                        x9 = new izs() { // from class: xsna.fe2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                tny tnyVar = (tny) obj3;
                                wh50 wh50Var4 = wh50Var;
                                if (!epx.f((tny) wh50Var4.getValue(), tnyVar)) {
                                    wh50Var4.setValue(tnyVar);
                                    boolean booleanValue2 = ((Boolean) wh50Var3.getValue()).booleanValue();
                                    tny tnyVar2 = (tny) wh50Var4.getValue();
                                    if (z16 && booleanValue2) {
                                        myc0.h(yvjVar, null, null, new pe2(yc8Var4, tnyVar2, null), 3);
                                        gzsVar.invoke();
                                    }
                                }
                                return s3q0.a;
                            }
                        };
                        wh50Var2 = wh50Var3;
                        M.R(x9);
                    }
                    q630 s2 = fo50.s(egi.o(q630Var, (izs) x9), yc8Var);
                    int i25 = i14 & 57344;
                    int i26 = i14 & 458752;
                    int i27 = i5 & 896;
                    boolean y2 = ((i5 & 29360128) == 8388608) | ((i5 & 14) == 4) | ((i14 & 14) == 4) | M.y(drawable3) | M.y(charSequence4) | (i25 == 16384) | (i26 == i6) | (i27 == 256) | ((i5 & 57344) == 16384) | ((234881024 & i5) == 67108864) | ((1879048192 & i5) == 536870912);
                    Object x10 = M.x();
                    if (y2 || x10 == obj2) {
                        i15 = i25;
                        i16 = i26;
                        final wh50 wh50Var4 = wh50Var2;
                        i17 = 131072;
                        obj = new izs() { // from class: xsna.ge2
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                izs izsVar2 = izsVar;
                                wh50 wh50Var5 = wh50Var4;
                                le2 le2Var = new le2(izsVar2, wh50Var5);
                                final me2 me2Var = new me2(0, wh50Var5);
                                VkFormField vkFormField = (VkFormField) LayoutInflater.from((Context) obj3).inflate(R.layout.vk_form_item_layout, (ViewGroup) null, false);
                                VkInputSelect vkInputSelect = (VkInputSelect) vkFormField.findViewById(R.id.edit_text_input);
                                ucp ucpVar = ucp.a;
                                vkInputSelect.setText(ucp.i(str));
                                vkInputSelect.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
                                vkInputSelect.b(new oe2(le2Var));
                                vkInputSelect.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.ce2
                                    @Override // android.view.View.OnFocusChangeListener
                                    public final void onFocusChange(View view2, boolean z17) {
                                        me2.this.invoke(Boolean.valueOf(z17));
                                    }
                                });
                                vkFormField.setAfterIconButtonDrawable(drawable3);
                                vkFormField.setAfterIconButtonContentDescription(charSequence4);
                                vkFormField.setAfterIconButtonVisible(z12);
                                vkFormField.setOnAfterIconButtonClickListener(new de2(0, gzsVar4));
                                String str10 = str3;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                vkFormField.setLabel(str10);
                                bwt0.Q(vkFormField.findViewById(R.id.vk_form_item_layout_caption), R.id.edit_text_length_counter_auto_test, str6);
                                VkInputSelect vkInputSelect2 = (VkInputSelect) vkFormField.findViewById(R.id.edit_text_input);
                                bwt0.Q(vkInputSelect2, R.id.edit_text_input_auto_test, str5);
                                vkInputSelect2.setHint(str2);
                                return vkFormField;
                            }
                        };
                        M.R(obj);
                    } else {
                        obj = x10;
                        i15 = i25;
                        i16 = i26;
                        i17 = 131072;
                    }
                    izs izsVar2 = (izs) obj;
                    boolean y3 = ((i5 & 112) == 32) | ((i5 & 458752) == i17) | (i27 == 256) | ((i5 & 3670016) == 1048576) | (i15 == 16384) | M.y(drawable3) | (i16 == 131072) | M.y(charSequence4) | ((i14 & 3670016) == 1048576) | ((i14 & 29360128) == 8388608);
                    Object x11 = M.x();
                    if (y3 || x11 == obj2) {
                        charSequence3 = charSequence4;
                        num3 = num5;
                        z10 = z8;
                        boolean z17 = z12;
                        gzs<s3q0> gzsVar5 = gzsVar4;
                        Object he2Var = new he2(str4, z, str2, z10, z17, drawable3, charSequence3, num3, wh50Var2, gzsVar5, str9);
                        z12 = z17;
                        gzsVar4 = gzsVar5;
                        M.R(he2Var);
                        x11 = he2Var;
                    } else {
                        num3 = num5;
                        z10 = z8;
                        charSequence3 = charSequence4;
                    }
                    ae2.a(0, 0, M, izsVar2, (izs) x11, s2);
                    aVar2 = M;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    drawable2 = drawable3;
                    gzsVar3 = gzsVar4;
                    z6 = z10;
                    num2 = num3;
                    str8 = str9;
                    z5 = z12;
                    charSequence2 = charSequence3;
                }
                s = aVar2.s();
                if (s == null) {
                    s.d = new wzs() { // from class: xsna.ie2
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int I = ne7.I(i2 | 1);
                            int I2 = ne7.I(i3);
                            ne2.a(str, z, str2, q630Var, str3, str4, z6, i, str5, str6, izsVar, gzsVar, drawable2, charSequence2, z5, gzsVar3, num2, str8, (androidx.compose.runtime.a) obj3, I, I2, i4);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        }
        i11 = i4 & 32768;
        if (i11 == 0) {
        }
        i12 = i4 & 65536;
        if (i12 == 0) {
        }
        i13 = i4 & i6;
        if (i13 == 0) {
        }
        i14 = i10;
        if (M.t(i5 & 1, (i5 & 306783379) == 306783378 || (4793491 & i14) != 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
