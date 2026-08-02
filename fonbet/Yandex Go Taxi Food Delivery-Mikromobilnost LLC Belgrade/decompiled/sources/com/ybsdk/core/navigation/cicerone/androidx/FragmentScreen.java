package com.ybsdk.core.navigation.cicerone.androidx;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.media3.exoplayer.offline.DownloadService;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.oo31;
import defpackage.qoi0;
import defpackage.unr0;
import defpackage.zzb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R%\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0006¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010)R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001f¨\u0006B"}, d2 = {"Lcom/ybsdk/core/navigation/cicerone/androidx/FragmentScreen;", "Lcom/ybsdk/core/navigation/cicerone/Screen;", "", "key", "", "clearContainer", "Lcom/ybsdk/core/navigation/ScreenParams;", "screenParams", "Lcom/ybsdk/core/navigation/cicerone/androidx/TransitionPolicyType;", "transitionPolicy", "Llfx;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", DownloadService.KEY_REQUIREMENTS, "<init>", "(Ljava/lang/String;ZLcom/ybsdk/core/navigation/ScreenParams;Lcom/ybsdk/core/navigation/cicerone/androidx/TransitionPolicyType;Llfx;Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;)V", "Landroidx/fragment/app/m;", "factory", "createFragment", "(Landroidx/fragment/app/m;)Landroidx/fragment/app/Fragment;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/ybsdk/core/navigation/ScreenParams;", "component4", "()Lcom/ybsdk/core/navigation/cicerone/androidx/TransitionPolicyType;", "component5", "()Llfx;", "component6", "()Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "copy", "(Ljava/lang/String;ZLcom/ybsdk/core/navigation/ScreenParams;Lcom/ybsdk/core/navigation/cicerone/androidx/TransitionPolicyType;Llfx;Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;)Lcom/ybsdk/core/navigation/cicerone/androidx/FragmentScreen;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Z", "getClearContainer", "Lcom/ybsdk/core/navigation/ScreenParams;", "getScreenParams", "Lcom/ybsdk/core/navigation/cicerone/androidx/TransitionPolicyType;", "getTransitionPolicy", "Llfx;", "getFragmentClass", "getFragmentClass$annotations", "()V", "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "getRequirements", "getScreenKey", "screenKey", "core-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FragmentScreen implements Screen {
    public static final Parcelable.Creator<FragmentScreen> CREATOR = new Creator();
    private final boolean clearContainer;
    private final lfx fragmentClass;
    private final String key;
    private final OpenScreenRequirement requirements;
    private final ScreenParams screenParams;
    private final TransitionPolicyType transitionPolicy;

    public /* synthetic */ FragmentScreen(String str, boolean z, ScreenParams screenParams, TransitionPolicyType transitionPolicyType, lfx lfxVar, OpenScreenRequirement openScreenRequirement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : screenParams, (i & 8) != 0 ? TransitionPolicyType.DEFAULT : transitionPolicyType, lfxVar, openScreenRequirement);
    }

    public static /* synthetic */ FragmentScreen copy$default(FragmentScreen fragmentScreen, String str, boolean z, ScreenParams screenParams, TransitionPolicyType transitionPolicyType, lfx lfxVar, OpenScreenRequirement openScreenRequirement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentScreen.key;
        }
        if ((i & 2) != 0) {
            z = fragmentScreen.clearContainer;
        }
        if ((i & 4) != 0) {
            screenParams = fragmentScreen.screenParams;
        }
        if ((i & 8) != 0) {
            transitionPolicyType = fragmentScreen.transitionPolicy;
        }
        if ((i & 16) != 0) {
            lfxVar = fragmentScreen.fragmentClass;
        }
        if ((i & 32) != 0) {
            openScreenRequirement = fragmentScreen.requirements;
        }
        lfx lfxVar2 = lfxVar;
        OpenScreenRequirement openScreenRequirement2 = openScreenRequirement;
        return fragmentScreen.copy(str, z, screenParams, transitionPolicyType, lfxVar2, openScreenRequirement2);
    }

    public static /* synthetic */ void getFragmentClass$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getClearContainer() {
        return this.clearContainer;
    }

    /* renamed from: component3, reason: from getter */
    public final ScreenParams getScreenParams() {
        return this.screenParams;
    }

    /* renamed from: component4, reason: from getter */
    public final TransitionPolicyType getTransitionPolicy() {
        return this.transitionPolicy;
    }

    /* renamed from: component5, reason: from getter */
    public final lfx getFragmentClass() {
        return this.fragmentClass;
    }

    /* renamed from: component6, reason: from getter */
    public final OpenScreenRequirement getRequirements() {
        return this.requirements;
    }

    public final FragmentScreen copy(String key, boolean clearContainer, ScreenParams screenParams, TransitionPolicyType transitionPolicy, lfx fragmentClass, OpenScreenRequirement requirements) {
        return new FragmentScreen(key, clearContainer, screenParams, transitionPolicy, fragmentClass, requirements);
    }

    public final Fragment createFragment(m factory) {
        Fragment a = factory.a(ClassLoader.getSystemClassLoader(), ((zzb) this.fragmentClass).a().getName());
        ScreenParams screenParams = this.screenParams;
        if (screenParams != null) {
            Bundle arguments = a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putParcelable(a.getClass().getName(), screenParams);
            a.setArguments(arguments);
        }
        TransitionPolicyType transitionPolicyType = this.transitionPolicy;
        Bundle arguments2 = a.getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putSerializable("TRANSITION_POLICY_TYPE", transitionPolicyType);
        a.setArguments(arguments2);
        OpenScreenRequirement requirements = getRequirements();
        Bundle arguments3 = a.getArguments();
        if (arguments3 == null) {
            arguments3 = new Bundle();
        }
        arguments3.putParcelable("KEY_SCREEN_REQUIREMENT", requirements);
        a.setArguments(arguments3);
        return a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentScreen)) {
            return false;
        }
        FragmentScreen fragmentScreen = (FragmentScreen) other;
        return jl40.l(this.key, fragmentScreen.key) && this.clearContainer == fragmentScreen.clearContainer && jl40.l(this.screenParams, fragmentScreen.screenParams) && this.transitionPolicy == fragmentScreen.transitionPolicy && jl40.l(this.fragmentClass, fragmentScreen.fragmentClass) && jl40.l(this.requirements, fragmentScreen.requirements);
    }

    public final boolean getClearContainer() {
        return this.clearContainer;
    }

    public final lfx getFragmentClass() {
        return this.fragmentClass;
    }

    public final String getKey() {
        return this.key;
    }

    @Override // com.ybsdk.core.navigation.cicerone.Screen
    public OpenScreenRequirement getRequirements() {
        return this.requirements;
    }

    @Override // com.ybsdk.core.navigation.cicerone.Screen
    public String getScreenKey() {
        return this.key;
    }

    public final ScreenParams getScreenParams() {
        return this.screenParams;
    }

    public final TransitionPolicyType getTransitionPolicy() {
        return this.transitionPolicy;
    }

    public int hashCode() {
        int e = unr0.e(this.key.hashCode() * 31, 31, this.clearContainer);
        ScreenParams screenParams = this.screenParams;
        return this.requirements.hashCode() + ((((g0c) this.fragmentClass).hashCode() + ((this.transitionPolicy.hashCode() + ((e + (screenParams == null ? 0 : screenParams.hashCode())) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.key;
        boolean z = this.clearContainer;
        ScreenParams screenParams = this.screenParams;
        TransitionPolicyType transitionPolicyType = this.transitionPolicy;
        lfx lfxVar = this.fragmentClass;
        OpenScreenRequirement openScreenRequirement = this.requirements;
        StringBuilder l = oo31.l("FragmentScreen(key=", str, ", clearContainer=", ", screenParams=", z);
        l.append(screenParams);
        l.append(", transitionPolicy=");
        l.append(transitionPolicyType);
        l.append(", fragmentClass=");
        l.append(lfxVar);
        l.append(", requirements=");
        l.append(openScreenRequirement);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeInt(this.clearContainer ? 1 : 0);
        dest.writeParcelable(this.screenParams, flags);
        dest.writeString(this.transitionPolicy.name());
        dest.writeString(((g0c) this.fragmentClass).c());
        dest.writeParcelable(this.requirements, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FragmentScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FragmentScreen createFromParcel(Parcel parcel) {
            return new FragmentScreen(parcel.readString(), parcel.readInt() != 0, (ScreenParams) parcel.readParcelable(FragmentScreen.class.getClassLoader()), TransitionPolicyType.valueOf(parcel.readString()), qoi0.a(Class.forName(parcel.readString())), (OpenScreenRequirement) parcel.readParcelable(FragmentScreen.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FragmentScreen[] newArray(int i) {
            return new FragmentScreen[i];
        }
    }

    public FragmentScreen(String str, boolean z, ScreenParams screenParams, TransitionPolicyType transitionPolicyType, lfx lfxVar, OpenScreenRequirement openScreenRequirement) {
        this.key = str;
        this.clearContainer = z;
        this.screenParams = screenParams;
        this.transitionPolicy = transitionPolicyType;
        this.fragmentClass = lfxVar;
        this.requirements = openScreenRequirement;
    }
}
