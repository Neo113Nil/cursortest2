package xsna;

import com.vk.translate.impl.models.SupportedTranslateLanguage;

/* compiled from: TranslateResult.kt */
/* loaded from: classes6.dex */
public abstract class aop0 {

    /* compiled from: TranslateResult.kt */
    public static final class a extends aop0 {
        public final CharSequence a;
        public final SupportedTranslateLanguage b;
        public final SupportedTranslateLanguage c;

        public a(String str, SupportedTranslateLanguage supportedTranslateLanguage, SupportedTranslateLanguage supportedTranslateLanguage2) {
            this.a = str;
            this.b = supportedTranslateLanguage;
            this.c = supportedTranslateLanguage2;
        }
    }

    /* compiled from: TranslateResult.kt */
    public static final class b extends aop0 {
        public final onp0 a;

        public b(onp0 onp0Var) {
            this.a = onp0Var;
        }
    }
}
