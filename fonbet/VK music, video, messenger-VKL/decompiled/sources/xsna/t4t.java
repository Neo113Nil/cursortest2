package xsna;

import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.attachpicker.ImageSizeLimits;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.media.MediaFilteringStrategy;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: GalleryParams.kt */
/* loaded from: classes15.dex */
public final class t4t {
    public static final t4t J = new t4t(false, false, false, 0, 0, 0, null, false, true, false, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, false, false, 0, false, false, false, false, false, 0, MediaFilteringStrategy.NONE, false, false, true, true, false, false, false, new ImageSizeLimits(null, null, null, null, 15, null), new ImageFormatRestrictions(null, null, 3, null), new GalleryPickerSourceConfiguration(false, false, null, false, false, false, false, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null), null, null, false, null);
    public final boolean A;
    public final boolean B;
    public final ImageSizeLimits C;
    public final ImageFormatRestrictions D;
    public final GalleryPickerSourceConfiguration E;
    public final Integer F;
    public final Integer G;
    public final boolean H;
    public final GalleryPickerInitialData I;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final MediaFilteringStrategy u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public t4t(boolean z, boolean z2, boolean z3, long j, long j2, long j3, String str, boolean z4, boolean z5, boolean z6, int i, boolean z7, boolean z8, long j4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i2, MediaFilteringStrategy mediaFilteringStrategy, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, ImageSizeLimits imageSizeLimits, ImageFormatRestrictions imageFormatRestrictions, GalleryPickerSourceConfiguration galleryPickerSourceConfiguration, Integer num, Integer num2, boolean z21, GalleryPickerInitialData galleryPickerInitialData) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = i;
        this.l = z7;
        this.m = z8;
        this.n = j4;
        this.o = z9;
        this.p = z10;
        this.q = z11;
        this.r = z12;
        this.s = z13;
        this.t = i2;
        this.u = mediaFilteringStrategy;
        this.v = z14;
        this.w = z15;
        this.x = z16;
        this.y = z17;
        this.z = z18;
        this.A = z19;
        this.B = z20;
        this.C = imageSizeLimits;
        this.D = imageFormatRestrictions;
        this.E = galleryPickerSourceConfiguration;
        this.F = num;
        this.G = num2;
        this.H = z21;
        this.I = galleryPickerInitialData;
    }

    public static t4t a(t4t t4tVar, String str, int i) {
        boolean z = t4tVar.a;
        boolean z2 = t4tVar.b;
        boolean z3 = t4tVar.c;
        long j = (i & 8) != 0 ? t4tVar.d : 1000L;
        long j2 = t4tVar.e;
        long j3 = (i & 32) != 0 ? t4tVar.f : Long.MAX_VALUE;
        String str2 = (i & 64) != 0 ? t4tVar.g : str;
        boolean z4 = t4tVar.h;
        boolean z5 = t4tVar.i;
        boolean z6 = t4tVar.j;
        int i2 = t4tVar.k;
        boolean z7 = t4tVar.l;
        boolean z8 = t4tVar.m;
        long j4 = t4tVar.n;
        boolean z9 = t4tVar.o;
        boolean z10 = t4tVar.p;
        boolean z11 = t4tVar.q;
        boolean z12 = t4tVar.r;
        boolean z13 = t4tVar.s;
        int i3 = t4tVar.t;
        MediaFilteringStrategy mediaFilteringStrategy = t4tVar.u;
        boolean z14 = t4tVar.v;
        boolean z15 = t4tVar.w;
        boolean z16 = t4tVar.x;
        boolean z17 = t4tVar.y;
        boolean z18 = t4tVar.z;
        boolean z19 = t4tVar.A;
        boolean z20 = t4tVar.B;
        ImageSizeLimits imageSizeLimits = t4tVar.C;
        ImageFormatRestrictions imageFormatRestrictions = t4tVar.D;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = t4tVar.E;
        Integer num = t4tVar.F;
        Integer num2 = t4tVar.G;
        boolean z21 = t4tVar.H;
        GalleryPickerInitialData galleryPickerInitialData = t4tVar.I;
        t4tVar.getClass();
        return new t4t(z, z2, z3, j, j2, j3, str2, z4, z5, z6, i2, z7, z8, j4, z9, z10, z11, z12, z13, i3, mediaFilteringStrategy, z14, z15, z16, z17, z18, z19, z20, imageSizeLimits, imageFormatRestrictions, galleryPickerSourceConfiguration, num, num2, z21, galleryPickerInitialData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4t)) {
            return false;
        }
        t4t t4tVar = (t4t) obj;
        return this.a == t4tVar.a && this.b == t4tVar.b && this.c == t4tVar.c && this.d == t4tVar.d && this.e == t4tVar.e && this.f == t4tVar.f && epx.f(this.g, t4tVar.g) && this.h == t4tVar.h && this.i == t4tVar.i && this.j == t4tVar.j && this.k == t4tVar.k && this.l == t4tVar.l && this.m == t4tVar.m && this.n == t4tVar.n && this.o == t4tVar.o && this.p == t4tVar.p && this.q == t4tVar.q && this.r == t4tVar.r && this.s == t4tVar.s && this.t == t4tVar.t && this.u == t4tVar.u && this.v == t4tVar.v && this.w == t4tVar.w && this.x == t4tVar.x && this.y == t4tVar.y && this.z == t4tVar.z && this.A == t4tVar.A && this.B == t4tVar.B && epx.f(this.C, t4tVar.C) && epx.f(this.D, t4tVar.D) && epx.f(this.E, t4tVar.E) && epx.f(this.F, t4tVar.F) && epx.f(this.G, t4tVar.G) && this.H == t4tVar.H && epx.f(this.I, t4tVar.I);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(bh10.a(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.u.hashCode() + shy.a(this.t, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(qoy.b(qoy.b(shy.a(this.k, qoy.b(qoy.b(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31)) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B)) * 31)) * 31)) * 31;
        Integer num = this.F;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.G;
        int b = qoy.b((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.H);
        GalleryPickerInitialData galleryPickerInitialData = this.I;
        return b + (galleryPickerInitialData != null ? galleryPickerInitialData.b.hashCode() : 0);
    }

    public final String toString() {
        return "GalleryParams(preventStyling=" + this.a + ", preventStylingPhoto=" + this.b + ", preventStylingVideo=" + this.c + ", videoMinLengthMs=" + this.d + ", videoMaxLengthMs=" + this.e + ", trimEndPositionMs=" + this.f + ", staticHeaderTitle=" + this.g + ", bigPreviews=" + this.h + ", cameraEnabled=" + this.i + ", singleMode=" + this.j + ", mediaType=" + this.k + ", thumb=" + this.l + ", isNewThumbFlow=" + this.m + ", dialogId=" + this.n + ", longPreviews=" + this.o + ", preview15=" + this.p + ", shortDivider=" + this.q + ", qrDetection=" + this.r + ", qrResult=" + this.s + ", maxContentDurationMs=" + this.t + ", filteringStrategy=" + this.u + ", isAttachLimitHintEnabled=" + this.v + ", isFullHd=" + this.w + ", defaultAlbumEntriesEnabled=" + this.x + ", orientationLockerEnabled=" + this.y + ", showStoryCamera=" + this.z + ", showClipsCamera=" + this.A + ", shortPreviews=" + this.B + ", imageSizeLimits=" + this.C + ", imageFormatRestrictions=" + this.D + ", sourceConfiguration=" + this.E + ", counterButtonColor=" + this.F + ", initialPadding=" + this.G + ", isNewPhotoEditorCollageContext=" + this.H + ", galleryPickerInitialData=" + this.I + ')';
    }
}
