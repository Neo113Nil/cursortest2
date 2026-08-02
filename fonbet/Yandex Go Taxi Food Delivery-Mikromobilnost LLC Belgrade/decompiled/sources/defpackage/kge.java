package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class kge implements jge, lge {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int w;
    public Uri x;
    public Bundle y;

    public kge(kge kgeVar) {
        ClipData clipData = kgeVar.b;
        clipData.getClass();
        this.b = clipData;
        int i = kgeVar.c;
        d6z.p(i, 0, 5, "source");
        this.c = i;
        int i2 = kgeVar.w;
        if ((i2 & 1) != i2) {
            yhl.f("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.w = i2;
        this.x = kgeVar.x;
        this.y = kgeVar.y;
    }

    @Override // defpackage.jge
    public void a(Uri uri) {
        this.x = uri;
    }

    @Override // defpackage.lge
    public ContentInfo b() {
        return null;
    }

    @Override // defpackage.jge
    public mge build() {
        return new mge(new kge(this));
    }

    @Override // defpackage.lge
    public ClipData e() {
        return this.b;
    }

    @Override // defpackage.jge
    public void f(ClipData clipData) {
        this.b = clipData;
    }

    @Override // defpackage.jge
    public void g(int i) {
        this.w = i;
    }

    @Override // defpackage.lge
    public Bundle getExtras() {
        return this.y;
    }

    @Override // defpackage.lge
    public int getFlags() {
        return this.w;
    }

    @Override // defpackage.lge
    public int getSource() {
        return this.c;
    }

    @Override // defpackage.lge
    public Uri k() {
        return this.x;
    }

    @Override // defpackage.jge
    public void setExtras(Bundle bundle) {
        this.y = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.x;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.w;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + Extension.C_BRAKE;
                }
                sb.append(str);
                return oyr.t(sb, this.y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kge() {
    }
}
