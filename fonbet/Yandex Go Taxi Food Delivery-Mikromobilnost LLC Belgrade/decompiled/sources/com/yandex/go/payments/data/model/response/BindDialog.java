package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BindDialog;", "", "Companion", "LegalFooter", "Overrides", "com/yandex/go/payments/data/model/response/o", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BindDialog {
    public static final o Companion = new o();
    public static final BindDialog g = new BindDialog(0);
    public final String a;
    public final String b;
    public final ActionButton c;
    public final ActionButton d;
    public final LegalFooter e;
    public final Overrides f;

    public BindDialog(int i, String str, String str2, ActionButton actionButton, ActionButton actionButton2, LegalFooter legalFooter, Overrides overrides) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = actionButton;
        }
        if ((i & 8) == 0) {
            ActionButton.Companion.getClass();
            this.d = ActionButton.d;
        } else {
            this.d = actionButton2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = legalFooter;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = overrides;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindDialog)) {
            return false;
        }
        BindDialog bindDialog = (BindDialog) obj;
        return jl40.l(this.a, bindDialog.a) && jl40.l(this.b, bindDialog.b) && jl40.l(this.c, bindDialog.c) && jl40.l(this.d, bindDialog.d) && jl40.l(this.e, bindDialog.e) && jl40.l(this.f, bindDialog.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31)) * 31;
        LegalFooter legalFooter = this.e;
        int hashCode4 = (hashCode3 + (legalFooter == null ? 0 : legalFooter.hashCode())) * 31;
        Overrides overrides = this.f;
        return hashCode4 + (overrides != null ? overrides.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BindDialog(title=", this.a, ", descriptions=", this.b, ", additionalButton=");
        v.append(this.c);
        v.append(", mainButton=");
        v.append(this.d);
        v.append(", legalFooter=");
        v.append(this.e);
        v.append(", overrides=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BindDialog$LegalFooter;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LegalFooter {
        public static final p Companion = new p();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ LegalFooter(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegalFooter)) {
                return false;
            }
            LegalFooter legalFooter = (LegalFooter) obj;
            return jl40.l(this.a, legalFooter.a) && jl40.l(this.b, legalFooter.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LegalFooter(link=" + this.a + ", linkText=" + this.b + Extension.C_BRAKE;
        }

        public LegalFooter() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BindDialog$Overrides;", "", "Companion", "BindingDialogOverride", "$serializer", "com/yandex/go/payments/data/model/response/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Overrides {
        public static final r Companion = new r();
        public final BindingDialogOverride a;
        public final BindingDialogOverride b;

        public /* synthetic */ Overrides(int i, BindingDialogOverride bindingDialogOverride, BindingDialogOverride bindingDialogOverride2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bindingDialogOverride;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bindingDialogOverride2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overrides)) {
                return false;
            }
            Overrides overrides = (Overrides) obj;
            return jl40.l(this.a, overrides.a) && jl40.l(this.b, overrides.b);
        }

        public final int hashCode() {
            BindingDialogOverride bindingDialogOverride = this.a;
            int hashCode = (bindingDialogOverride == null ? 0 : bindingDialogOverride.hashCode()) * 31;
            BindingDialogOverride bindingDialogOverride2 = this.b;
            return hashCode + (bindingDialogOverride2 != null ? bindingDialogOverride2.hashCode() : 0);
        }

        public final String toString() {
            return "Overrides(withoutWebOverride=" + this.a + ", withWebOverride=" + this.b + Extension.C_BRAKE;
        }

        public Overrides() {
            this.a = null;
            this.b = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BindDialog$Overrides$BindingDialogOverride;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class BindingDialogOverride {
            public static final q Companion = new q();
            public final String a;
            public final String b;
            public final ActionButton c;
            public final ActionButton d;
            public final LegalFooter e;

            public /* synthetic */ BindingDialogOverride(int i, String str, String str2, ActionButton actionButton, ActionButton actionButton2, LegalFooter legalFooter) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = actionButton;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = actionButton2;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = legalFooter;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BindingDialogOverride)) {
                    return false;
                }
                BindingDialogOverride bindingDialogOverride = (BindingDialogOverride) obj;
                return jl40.l(this.a, bindingDialogOverride.a) && jl40.l(this.b, bindingDialogOverride.b) && jl40.l(this.c, bindingDialogOverride.c) && jl40.l(this.d, bindingDialogOverride.d) && jl40.l(this.e, bindingDialogOverride.e);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                ActionButton actionButton = this.c;
                int hashCode3 = (hashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
                ActionButton actionButton2 = this.d;
                int hashCode4 = (hashCode3 + (actionButton2 == null ? 0 : actionButton2.hashCode())) * 31;
                LegalFooter legalFooter = this.e;
                return hashCode4 + (legalFooter != null ? legalFooter.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder v = b64.v("BindingDialogOverride(title=", this.a, ", description=", this.b, ", additionalButton=");
                v.append(this.c);
                v.append(", mainButton=");
                v.append(this.d);
                v.append(", legalFooter=");
                v.append(this.e);
                v.append(Extension.C_BRAKE);
                return v.toString();
            }

            public BindingDialogOverride() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
        }
    }

    public BindDialog() {
        this(0);
    }

    public BindDialog(int i) {
        ActionButton.Companion.getClass();
        ActionButton actionButton = ActionButton.d;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = actionButton;
        this.e = null;
        this.f = null;
    }
}
