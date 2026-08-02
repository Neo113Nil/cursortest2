package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final class i9u implements hq31 {
    public final String a;
    public final String b;
    public final float c;
    public final float w;

    public i9u(String str, String str2, float f, float f2) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.w = f2;
    }

    @Override // defpackage.hq31
    public final Map a() {
        return b.i(new Pair("header_text", this.a), new Pair("header_shortcut_id", this.b), new Pair("visibility_height", Float.valueOf(this.c)), new Pair("visibility_width", Float.valueOf(this.w)));
    }

    @Override // defpackage.hq31
    public final float e() {
        return this.c;
    }

    @Override // defpackage.hq31
    public final float u() {
        return this.w;
    }
}
