package com.yandex.go.design.compose.slot.body;

import defpackage.it1;
import defpackage.jt1;
import defpackage.k4o;
import defpackage.so5;
import defpackage.uo5;
import defpackage.x4c;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/design/compose/slot/body/BodyAlign;", "", "Lit1;", "horizontal", "Lit1;", "b", "()Lit1;", "Lsjy0;", "textAlign", CA20Status.STATUS_USER_I, "c", "()I", "Ljt1;", "alignment", "Ljt1;", "a", "()Ljt1;", "Start", "Center", "End", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BodyAlign {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BodyAlign[] $VALUES;
    public static final BodyAlign Center;
    public static final BodyAlign End;
    public static final BodyAlign Start;
    private final jt1 alignment;
    private final it1 horizontal;
    private final int textAlign;

    static {
        BodyAlign bodyAlign = new BodyAlign("Start", 0, x4c.G, 5, x4c.x);
        Start = bodyAlign;
        BodyAlign bodyAlign2 = new BodyAlign("Center", 1, x4c.H, 3, x4c.y);
        Center = bodyAlign2;
        BodyAlign bodyAlign3 = new BodyAlign("End", 2, x4c.I, 6, x4c.z);
        End = bodyAlign3;
        BodyAlign[] bodyAlignArr = {bodyAlign, bodyAlign2, bodyAlign3};
        $VALUES = bodyAlignArr;
        $ENTRIES = a.a(bodyAlignArr);
    }

    public BodyAlign(String str, int i, so5 so5Var, int i2, uo5 uo5Var) {
        this.horizontal = so5Var;
        this.textAlign = i2;
        this.alignment = uo5Var;
    }

    public static BodyAlign valueOf(String str) {
        return (BodyAlign) Enum.valueOf(BodyAlign.class, str);
    }

    public static BodyAlign[] values() {
        return (BodyAlign[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final jt1 getAlignment() {
        return this.alignment;
    }

    /* renamed from: b, reason: from getter */
    public final it1 getHorizontal() {
        return this.horizontal;
    }

    /* renamed from: c, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }
}
