package xsna;

import com.vk.dto.music.StoryMusicInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.ArrayList;

/* compiled from: ProcessingUploadData.kt */
/* loaded from: classes16.dex */
public final class jhd0 {
    public final String a;
    public final t8o0 b;
    public final StoryMusicInfo c;
    public final ArrayList d;
    public final String e;
    public final MobileOfficialAppsClipsStat$ClipsCreateContext f;

    public jhd0(String str, t8o0 t8o0Var, StoryMusicInfo storyMusicInfo, ArrayList arrayList, String str2, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
        this.a = str;
        this.b = t8o0Var;
        this.c = storyMusicInfo;
        this.d = arrayList;
        this.e = str2;
        this.f = mobileOfficialAppsClipsStat$ClipsCreateContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhd0)) {
            return false;
        }
        jhd0 jhd0Var = (jhd0) obj;
        return this.a.equals(jhd0Var.a) && epx.f(this.b, jhd0Var.b) && this.c.equals(jhd0Var.c) && this.d.equals(jhd0Var.d) && epx.f(this.e, jhd0Var.e) && this.f.equals(jhd0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t8o0 t8o0Var = this.b;
        int a = qr.a(this.d, (this.c.hashCode() + ((hashCode + (t8o0Var == null ? 0 : t8o0Var.hashCode())) * 31)) * 31, 31);
        String str = this.e;
        return this.f.hashCode() + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProcessingUploadData(templateRawId=" + this.a + ", templateInfo=" + this.b + ", musicInfo=" + this.c + ", videoItems=" + this.d + ", hashTag=" + this.e + ", clipsCreateContext=" + this.f + ')';
    }
}
