package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import kotlin.collections.EmptyList;

/* compiled from: ClipUpload.kt */
/* loaded from: classes17.dex */
public final class xdd {
    public final int a;
    public final ClipUploadData b;
    public had c;
    public final String d;
    public boolean e;
    public boolean f;
    public UserId h;
    public int j;
    public final boolean k;
    public final boolean l;
    public Integer g = null;
    public String i = null;

    public xdd(int i, ClipUploadData clipUploadData, had hadVar, String str, boolean z, boolean z2, UserId userId, int i2, boolean z3, boolean z4) {
        this.a = i;
        this.b = clipUploadData;
        this.c = hadVar;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.h = userId;
        this.j = i2;
        this.k = z3;
        this.l = z4;
    }

    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.l;
    }

    public final UserId c() {
        return this.h;
    }

    public final ClipUploadData d() {
        return this.b;
    }

    public final String e() {
        return this.i;
    }

    public final int f() {
        return this.a;
    }

    public final Integer g() {
        return this.g;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.e;
    }

    public final void j(boolean z) {
        this.f = z;
    }

    public final void k(boolean z) {
        this.e = z;
    }

    public final void l(UserId userId) {
        this.h = userId;
    }

    public final void m(String str) {
        this.i = str;
    }

    public final void n(Integer num) {
        this.g = num;
    }

    public final ClipVideoFile o() {
        ClipUploadData clipUploadData = this.b;
        ClickableStickers clickableStickers = clipUploadData.b.w;
        EmptyList emptyList = EmptyList.b;
        ClipVideoFile clipVideoFile = new ClipVideoFile(clickableStickers, null, emptyList, emptyList, null, null, OriginalSoundStatus.NONE, false, ClipLinkModerationStatus.UNDEFINED, null, emptyList, emptyList, jgp.b, null, null, emptyList, null, null, null);
        clipVideoFile.p = "short_video";
        String str = clipUploadData.b.e;
        if (str == null) {
            str = "";
        }
        clipVideoFile.m = str;
        clipVideoFile.O = true;
        clipVideoFile.G = true;
        UserId userId = this.h;
        if (userId == null) {
            userId = UserId.d;
        }
        clipVideoFile.b = userId;
        Integer num = this.g;
        clipVideoFile.c = num != null ? num.intValue() : 0;
        return clipVideoFile;
    }
}
