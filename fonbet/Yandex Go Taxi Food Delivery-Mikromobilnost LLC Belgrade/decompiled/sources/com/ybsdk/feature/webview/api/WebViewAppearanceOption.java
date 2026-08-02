package com.ybsdk.feature.webview.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.webview.api.WebViewControl;
import defpackage.jl40;
import defpackage.ql41;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/webview/api/WebViewControl;", "getControl", "()Lcom/ybsdk/feature/webview/api/WebViewControl;", "control", "", "getSupportBackByHistory", "()Z", "supportBackByHistory", "", "getTitle", "()Ljava/lang/String;", "title", "Companion", "ShowToolbar", "NoToolbar", "ql41", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$NoToolbar;", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$ShowToolbar;", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebViewAppearanceOption extends Parcelable {
    public static final ql41 Companion = ql41.a;

    WebViewControl getControl();

    boolean getSupportBackByHistory();

    String getTitle();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0015R\"\u0010&\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001b¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$NoToolbar;", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "Lcom/ybsdk/feature/webview/api/WebViewControl;", "control", "", "supportBackByHistory", "showAsOverlay", "<init>", "(Lcom/ybsdk/feature/webview/api/WebViewControl;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/webview/api/WebViewControl;", "component2", "()Z", "component3", "copy", "(Lcom/ybsdk/feature/webview/api/WebViewControl;ZZ)Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$NoToolbar;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/webview/api/WebViewControl;", "getControl", "Z", "getSupportBackByHistory", "getShowAsOverlay", "title", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoToolbar implements WebViewAppearanceOption {
        public static final Parcelable.Creator<NoToolbar> CREATOR = new Creator();
        private final WebViewControl control;
        private final boolean showAsOverlay;
        private final boolean supportBackByHistory;
        private final String title;

        public /* synthetic */ NoToolbar(WebViewControl webViewControl, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new WebViewControl(WebViewControl.Type.ARROW, null, 2, null) : webViewControl, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }

        public static /* synthetic */ NoToolbar copy$default(NoToolbar noToolbar, WebViewControl webViewControl, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                webViewControl = noToolbar.control;
            }
            if ((i & 2) != 0) {
                z = noToolbar.supportBackByHistory;
            }
            if ((i & 4) != 0) {
                z2 = noToolbar.showAsOverlay;
            }
            return noToolbar.copy(webViewControl, z, z2);
        }

        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final WebViewControl getControl() {
            return this.control;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSupportBackByHistory() {
            return this.supportBackByHistory;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAsOverlay() {
            return this.showAsOverlay;
        }

        public final NoToolbar copy(WebViewControl control, boolean supportBackByHistory, boolean showAsOverlay) {
            return new NoToolbar(control, supportBackByHistory, showAsOverlay);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoToolbar)) {
                return false;
            }
            NoToolbar noToolbar = (NoToolbar) other;
            return jl40.l(this.control, noToolbar.control) && this.supportBackByHistory == noToolbar.supportBackByHistory && this.showAsOverlay == noToolbar.showAsOverlay;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public WebViewControl getControl() {
            return this.control;
        }

        public final boolean getShowAsOverlay() {
            return this.showAsOverlay;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public boolean getSupportBackByHistory() {
            return this.supportBackByHistory;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            WebViewControl webViewControl = this.control;
            return Boolean.hashCode(this.showAsOverlay) + unr0.e((webViewControl == null ? 0 : webViewControl.hashCode()) * 31, 31, this.supportBackByHistory);
        }

        public String toString() {
            WebViewControl webViewControl = this.control;
            boolean z = this.supportBackByHistory;
            boolean z2 = this.showAsOverlay;
            StringBuilder sb = new StringBuilder("NoToolbar(control=");
            sb.append(webViewControl);
            sb.append(", supportBackByHistory=");
            sb.append(z);
            sb.append(", showAsOverlay=");
            return x4e.i(sb, z2, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            WebViewControl webViewControl = this.control;
            if (webViewControl == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                webViewControl.writeToParcel(dest, flags);
            }
            dest.writeInt(this.supportBackByHistory ? 1 : 0);
            dest.writeInt(this.showAsOverlay ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoToolbar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoToolbar createFromParcel(Parcel parcel) {
                return new NoToolbar(parcel.readInt() == 0 ? null : WebViewControl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoToolbar[] newArray(int i) {
                return new NoToolbar[i];
            }
        }

        public NoToolbar(WebViewControl webViewControl, boolean z, boolean z2) {
            this.control = webViewControl;
            this.supportBackByHistory = z;
            this.showAsOverlay = z2;
        }

        public NoToolbar() {
            this(null, false, false, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$ShowToolbar;", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "Lcom/ybsdk/feature/webview/api/WebViewControl;", "control", "", "supportBackByHistory", "", "title", "Lcom/ybsdk/core/utils/ColorModel;", "color", "<init>", "(Lcom/ybsdk/feature/webview/api/WebViewControl;ZLjava/lang/String;Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/webview/api/WebViewControl;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Lcom/ybsdk/core/utils/ColorModel;", "copy", "(Lcom/ybsdk/feature/webview/api/WebViewControl;ZLjava/lang/String;Lcom/ybsdk/core/utils/ColorModel;)Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption$ShowToolbar;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/webview/api/WebViewControl;", "getControl", "Z", "getSupportBackByHistory", "Ljava/lang/String;", "getTitle", "Lcom/ybsdk/core/utils/ColorModel;", "getColor", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowToolbar implements WebViewAppearanceOption {
        public static final Parcelable.Creator<ShowToolbar> CREATOR = new Creator();
        private final ColorModel color;
        private final WebViewControl control;
        private final boolean supportBackByHistory;
        private final String title;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ShowToolbar(WebViewControl webViewControl, boolean z, String str, ColorModel colorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(webViewControl, z, str, colorModel);
            webViewControl = (i & 1) != 0 ? new WebViewControl(WebViewControl.Type.CROSS, null, 2, null) : webViewControl;
            z = (i & 2) != 0 ? true : z;
            str = (i & 4) != 0 ? null : str;
            if ((i & 8) != 0) {
                WebViewAppearanceOption.Companion.getClass();
                colorModel = ql41.a();
            }
        }

        public static /* synthetic */ ShowToolbar copy$default(ShowToolbar showToolbar, WebViewControl webViewControl, boolean z, String str, ColorModel colorModel, int i, Object obj) {
            if ((i & 1) != 0) {
                webViewControl = showToolbar.control;
            }
            if ((i & 2) != 0) {
                z = showToolbar.supportBackByHistory;
            }
            if ((i & 4) != 0) {
                str = showToolbar.title;
            }
            if ((i & 8) != 0) {
                colorModel = showToolbar.color;
            }
            return showToolbar.copy(webViewControl, z, str, colorModel);
        }

        /* renamed from: component1, reason: from getter */
        public final WebViewControl getControl() {
            return this.control;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSupportBackByHistory() {
            return this.supportBackByHistory;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final ColorModel getColor() {
            return this.color;
        }

        public final ShowToolbar copy(WebViewControl control, boolean supportBackByHistory, String title, ColorModel color) {
            return new ShowToolbar(control, supportBackByHistory, title, color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowToolbar)) {
                return false;
            }
            ShowToolbar showToolbar = (ShowToolbar) other;
            return jl40.l(this.control, showToolbar.control) && this.supportBackByHistory == showToolbar.supportBackByHistory && jl40.l(this.title, showToolbar.title) && jl40.l(this.color, showToolbar.color);
        }

        public final ColorModel getColor() {
            return this.color;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public WebViewControl getControl() {
            return this.control;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public boolean getSupportBackByHistory() {
            return this.supportBackByHistory;
        }

        @Override // com.ybsdk.feature.webview.api.WebViewAppearanceOption
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            WebViewControl webViewControl = this.control;
            int e = unr0.e((webViewControl == null ? 0 : webViewControl.hashCode()) * 31, 31, this.supportBackByHistory);
            String str = this.title;
            return this.color.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ShowToolbar(control=" + this.control + ", supportBackByHistory=" + this.supportBackByHistory + ", title=" + this.title + ", color=" + this.color + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            WebViewControl webViewControl = this.control;
            if (webViewControl == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                webViewControl.writeToParcel(dest, flags);
            }
            dest.writeInt(this.supportBackByHistory ? 1 : 0);
            dest.writeString(this.title);
            dest.writeParcelable(this.color, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowToolbar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowToolbar createFromParcel(Parcel parcel) {
                return new ShowToolbar(parcel.readInt() == 0 ? null : WebViewControl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (ColorModel) parcel.readParcelable(ShowToolbar.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowToolbar[] newArray(int i) {
                return new ShowToolbar[i];
            }
        }

        public ShowToolbar(WebViewControl webViewControl, boolean z, String str, ColorModel colorModel) {
            this.control = webViewControl;
            this.supportBackByHistory = z;
            this.title = str;
            this.color = colorModel;
        }

        public ShowToolbar() {
            this(null, false, null, null, 15, null);
        }
    }
}
