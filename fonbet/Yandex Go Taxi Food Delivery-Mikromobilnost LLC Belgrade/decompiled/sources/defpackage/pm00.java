package defpackage;

import com.yandex.go.layers.api.model.Action;
import ru.yandex.taxi.common_models.net.map_object.z;

/* loaded from: classes5.dex */
public final class pm00 implements wsd0 {
    public final zzs a;
    public final String b;
    public final String c;
    public final z d;
    public final String e;
    public final String f;
    public final Action g;
    public final String h;
    public final Boolean i;

    public /* synthetic */ pm00(zzs zzsVar, String str, String str2, z zVar, String str3, String str4, String str5, Boolean bool, int i) {
        this(zzsVar, str, str2, zVar, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, Action.UNDEFINED, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool);
    }

    public final String a() {
        return this.b;
    }

    @Override // defpackage.wsd0
    public final z getAction() {
        return this.d;
    }

    @Override // defpackage.wsd0
    public final zzs getPosition() {
        return this.a;
    }

    @Override // defpackage.wsd0
    public final String o() {
        return this.c;
    }

    @Override // defpackage.wsd0
    public final String p() {
        return this.f;
    }

    @Override // defpackage.wsd0
    public final Boolean q() {
        return this.i;
    }

    @Override // defpackage.wsd0
    public final String r() {
        return this.e;
    }

    @Override // defpackage.wsd0
    public final String s() {
        return this.h;
    }

    public pm00(zzs zzsVar, String str, String str2, z zVar, String str3, String str4, Action action, String str5, Boolean bool) {
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = zVar;
        this.e = str3;
        this.f = str4;
        this.g = action;
        this.h = str5;
        this.i = bool;
    }
}
