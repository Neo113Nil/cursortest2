package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/ActionButton;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionButton {
    public static final a Companion = new a();
    public final TextItem a;
    public final String b;
    public final TextItem c;
    public final t0 d;
    public final ief e;
    public final ActionButtonPrerequisite f;

    public ActionButton(int i, TextItem textItem, String str, TextItem textItem2, t0 t0Var, ief iefVar, ActionButtonPrerequisite actionButtonPrerequisite) {
        if ((i & 1) == 0) {
            TextItem.Companion.getClass();
            textItem = TextItem.c;
        }
        this.a = textItem;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = textItem2;
        }
        if ((i & 8) == 0) {
            this.d = s0.INSTANCE;
        } else {
            this.d = t0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = actionButtonPrerequisite;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ActionButtonPrerequisite getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return jl40.l(this.a, actionButton.a) && jl40.l(this.b, actionButton.b) && jl40.l(this.c, actionButton.c) && jl40.l(this.d, actionButton.d) && jl40.l(this.e, actionButton.e) && jl40.l(this.f, actionButton.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TextItem textItem = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (textItem == null ? 0 : textItem.hashCode())) * 31)) * 31;
        ief iefVar = this.e;
        int hashCode4 = (hashCode3 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        ActionButtonPrerequisite actionButtonPrerequisite = this.f;
        return hashCode4 + (actionButtonPrerequisite != null ? actionButtonPrerequisite.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButton(title=" + this.a + ", backgroundColor=" + this.b + ", subtitle=" + this.c + ", tapAction=" + this.d + ", currencyRulesDto=" + this.e + ", prerequisites=" + this.f + Extension.C_BRAKE;
    }

    public ActionButton() {
        TextItem.Companion.getClass();
        s0 s0Var = s0.INSTANCE;
        this.a = TextItem.c;
        this.b = null;
        this.c = null;
        this.d = s0Var;
        this.e = null;
        this.f = null;
    }
}
