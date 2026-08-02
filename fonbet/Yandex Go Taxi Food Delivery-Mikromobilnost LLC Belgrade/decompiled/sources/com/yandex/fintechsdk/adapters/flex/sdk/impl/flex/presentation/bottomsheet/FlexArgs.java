package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.ywl;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J|\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b6\u0010\u0018R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010 ¨\u00069"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "", "Lu1m;", "query", "Lywl;", "document", "", "fullscreen", "closeOnTapOutside", "closeOnSlideDown", "dimBackground", "", "defaultHeight", "shouldLoadByQuery", "", "", "customProps", "<init>", "(Lu1m;Lywl;ZZZZLjava/lang/Float;ZLjava/util/Map;)V", "component1", "()Lu1m;", "component2", "()Lywl;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Ljava/lang/Float;", "component8", "component9", "()Ljava/util/Map;", "copy", "(Lu1m;Lywl;ZZZZLjava/lang/Float;ZLjava/util/Map;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lu1m;", "getQuery", "Lywl;", "getDocument", "Z", "getFullscreen", "getCloseOnTapOutside", "getCloseOnSlideDown", "getDimBackground", "Ljava/lang/Float;", "getDefaultHeight", "getShouldLoadByQuery", "Ljava/util/Map;", "getCustomProps", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlexArgs {
    private final boolean closeOnSlideDown;
    private final boolean closeOnTapOutside;
    private final Map<String, Object> customProps;
    private final Float defaultHeight;
    private final boolean dimBackground;
    private final ywl document;
    private final boolean fullscreen;
    private final u1m query;
    private final boolean shouldLoadByQuery;

    public FlexArgs(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map<String, ? extends Object> map) {
        this.query = u1mVar;
        this.document = ywlVar;
        this.fullscreen = z;
        this.closeOnTapOutside = z2;
        this.closeOnSlideDown = z3;
        this.dimBackground = z4;
        this.defaultHeight = f;
        this.shouldLoadByQuery = z5;
        this.customProps = map;
    }

    public static /* synthetic */ FlexArgs copy$default(FlexArgs flexArgs, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            u1mVar = flexArgs.query;
        }
        if ((i & 2) != 0) {
            ywlVar = flexArgs.document;
        }
        if ((i & 4) != 0) {
            z = flexArgs.fullscreen;
        }
        if ((i & 8) != 0) {
            z2 = flexArgs.closeOnTapOutside;
        }
        if ((i & 16) != 0) {
            z3 = flexArgs.closeOnSlideDown;
        }
        if ((i & 32) != 0) {
            z4 = flexArgs.dimBackground;
        }
        if ((i & 64) != 0) {
            f = flexArgs.defaultHeight;
        }
        if ((i & 128) != 0) {
            z5 = flexArgs.shouldLoadByQuery;
        }
        if ((i & 256) != 0) {
            map = flexArgs.customProps;
        }
        boolean z6 = z5;
        Map map2 = map;
        boolean z7 = z4;
        Float f2 = f;
        boolean z8 = z3;
        boolean z9 = z;
        return flexArgs.copy(u1mVar, ywlVar, z9, z2, z8, z7, f2, z6, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final u1m getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final ywl getDocument() {
        return this.document;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFullscreen() {
        return this.fullscreen;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCloseOnTapOutside() {
        return this.closeOnTapOutside;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseOnSlideDown() {
        return this.closeOnSlideDown;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDimBackground() {
        return this.dimBackground;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getDefaultHeight() {
        return this.defaultHeight;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldLoadByQuery() {
        return this.shouldLoadByQuery;
    }

    public final Map<String, Object> component9() {
        return this.customProps;
    }

    public final FlexArgs copy(u1m query, ywl document, boolean fullscreen, boolean closeOnTapOutside, boolean closeOnSlideDown, boolean dimBackground, Float defaultHeight, boolean shouldLoadByQuery, Map<String, ? extends Object> customProps) {
        return new FlexArgs(query, document, fullscreen, closeOnTapOutside, closeOnSlideDown, dimBackground, defaultHeight, shouldLoadByQuery, customProps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexArgs)) {
            return false;
        }
        FlexArgs flexArgs = (FlexArgs) other;
        return jl40.l(this.query, flexArgs.query) && jl40.l(this.document, flexArgs.document) && this.fullscreen == flexArgs.fullscreen && this.closeOnTapOutside == flexArgs.closeOnTapOutside && this.closeOnSlideDown == flexArgs.closeOnSlideDown && this.dimBackground == flexArgs.dimBackground && jl40.l(this.defaultHeight, flexArgs.defaultHeight) && this.shouldLoadByQuery == flexArgs.shouldLoadByQuery && jl40.l(this.customProps, flexArgs.customProps);
    }

    public final boolean getCloseOnSlideDown() {
        return this.closeOnSlideDown;
    }

    public final boolean getCloseOnTapOutside() {
        return this.closeOnTapOutside;
    }

    public final Map<String, Object> getCustomProps() {
        return this.customProps;
    }

    public final Float getDefaultHeight() {
        return this.defaultHeight;
    }

    public final boolean getDimBackground() {
        return this.dimBackground;
    }

    public final ywl getDocument() {
        return this.document;
    }

    public final boolean getFullscreen() {
        return this.fullscreen;
    }

    public final u1m getQuery() {
        return this.query;
    }

    public final boolean getShouldLoadByQuery() {
        return this.shouldLoadByQuery;
    }

    public int hashCode() {
        u1m u1mVar = this.query;
        int hashCode = (u1mVar == null ? 0 : u1mVar.hashCode()) * 31;
        ywl ywlVar = this.document;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((hashCode + (ywlVar == null ? 0 : ywlVar.hashCode())) * 31, 31, this.fullscreen), 31, this.closeOnTapOutside), 31, this.closeOnSlideDown), 31, this.dimBackground);
        Float f = this.defaultHeight;
        return this.customProps.hashCode() + unr0.e((e + (f != null ? f.hashCode() : 0)) * 31, 31, this.shouldLoadByQuery);
    }

    public String toString() {
        u1m u1mVar = this.query;
        ywl ywlVar = this.document;
        boolean z = this.fullscreen;
        boolean z2 = this.closeOnTapOutside;
        boolean z3 = this.closeOnSlideDown;
        boolean z4 = this.dimBackground;
        Float f = this.defaultHeight;
        boolean z5 = this.shouldLoadByQuery;
        Map<String, Object> map = this.customProps;
        StringBuilder sb = new StringBuilder("FlexArgs(query=");
        sb.append(u1mVar);
        sb.append(", document=");
        sb.append(ywlVar);
        sb.append(", fullscreen=");
        nnm.v(", closeOnTapOutside=", ", closeOnSlideDown=", sb, z, z2);
        nnm.v(", dimBackground=", ", defaultHeight=", sb, z3, z4);
        sb.append(f);
        sb.append(", shouldLoadByQuery=");
        sb.append(z5);
        sb.append(", customProps=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }
}
