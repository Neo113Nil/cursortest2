package com.yandex.passport.sloth.data;

import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class z extends g {
    public final String a;
    public final String b;
    public final String c;
    public final String w;
    public final SlothLoginProperties x;

    public z(String str, String str2, String str3, String str4, SlothLoginProperties slothLoginProperties) {
        super(SlothMode.Turbo);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = str4;
        this.x = slothLoginProperties;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return jl40.l(this.a, zVar.a) && jl40.l(this.b, zVar.b) && jl40.l(this.c, zVar.c) && jl40.l(this.w, zVar.w) && jl40.l(this.x, zVar.x);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.w;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        return Boolean.hashCode(false) + ((this.x.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    public final String toString() {
        return "Turbo(phoneNumber=" + this.a + ", email=" + this.b + ", firstName=" + this.c + ", lastName=" + this.w + ", properties=" + this.x + ", canGoBack=false)";
    }
}
