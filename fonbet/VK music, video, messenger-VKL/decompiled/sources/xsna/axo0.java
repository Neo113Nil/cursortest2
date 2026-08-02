package xsna;

import com.vk.dto.common.TimelineThumbs;
import java.util.ArrayList;

/* compiled from: TimelineThumbs.kt */
/* loaded from: classes2.dex */
public final class axo0 implements zwo0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final ArrayList h;

    public axo0(TimelineThumbs timelineThumbs) {
        this.a = timelineThumbs.b;
        this.b = timelineThumbs.c;
        this.c = timelineThumbs.d;
        this.d = timelineThumbs.e;
        this.e = timelineThumbs.f;
        this.f = timelineThumbs.g;
        this.g = timelineThumbs.h;
        this.h = i7o0.a(timelineThumbs.i);
    }

    @Override // xsna.zwo0
    public final int a() {
        return this.e;
    }

    @Override // xsna.zwo0
    public final int b() {
        return this.a;
    }

    @Override // xsna.zwo0
    public final int c() {
        return this.d;
    }

    @Override // xsna.zwo0
    public final boolean d() {
        return this.g;
    }

    @Override // xsna.zwo0
    public final int e() {
        return this.f;
    }

    @Override // xsna.zwo0
    public final ArrayList f() {
        return this.h;
    }

    @Override // xsna.zwo0
    public final int g() {
        return this.c;
    }

    @Override // xsna.zwo0
    public final int h() {
        return this.b;
    }
}
