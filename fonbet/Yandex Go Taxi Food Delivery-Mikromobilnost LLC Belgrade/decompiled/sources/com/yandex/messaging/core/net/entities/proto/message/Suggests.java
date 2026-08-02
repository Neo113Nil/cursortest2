package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;", "", "persist", "", "suggestButtons", "Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "layoutSuggestButtons", "Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;", "<init>", "(ZLcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;)V", "getPersist", "()Z", "getSuggestButtons", "()Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "getLayoutSuggestButtons", "()Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Suggests {

    @xuf0(tag = 101)
    private final LayoutSuggestButtons layoutSuggestButtons;

    @xuf0(tag = 1)
    private final boolean persist;

    @xuf0(tag = 100)
    private final SuggestButtons suggestButtons;

    public /* synthetic */ Suggests(boolean z, SuggestButtons suggestButtons, LayoutSuggestButtons layoutSuggestButtons, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : suggestButtons, (i & 4) != 0 ? null : layoutSuggestButtons);
    }

    public static /* synthetic */ Suggests copy$default(Suggests suggests, boolean z, SuggestButtons suggestButtons, LayoutSuggestButtons layoutSuggestButtons, int i, Object obj) {
        if ((i & 1) != 0) {
            z = suggests.persist;
        }
        if ((i & 2) != 0) {
            suggestButtons = suggests.suggestButtons;
        }
        if ((i & 4) != 0) {
            layoutSuggestButtons = suggests.layoutSuggestButtons;
        }
        return suggests.copy(z, suggestButtons, layoutSuggestButtons);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPersist() {
        return this.persist;
    }

    /* renamed from: component2, reason: from getter */
    public final SuggestButtons getSuggestButtons() {
        return this.suggestButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final LayoutSuggestButtons getLayoutSuggestButtons() {
        return this.layoutSuggestButtons;
    }

    public final Suggests copy(@Json(name = "Persist") boolean persist, @Json(name = "SuggestButtons") SuggestButtons suggestButtons, @Json(name = "LayoutSuggestButtons") LayoutSuggestButtons layoutSuggestButtons) {
        return new Suggests(persist, suggestButtons, layoutSuggestButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Suggests)) {
            return false;
        }
        Suggests suggests = (Suggests) other;
        return this.persist == suggests.persist && jl40.l(this.suggestButtons, suggests.suggestButtons) && jl40.l(this.layoutSuggestButtons, suggests.layoutSuggestButtons);
    }

    public final LayoutSuggestButtons getLayoutSuggestButtons() {
        return this.layoutSuggestButtons;
    }

    public final boolean getPersist() {
        return this.persist;
    }

    public final SuggestButtons getSuggestButtons() {
        return this.suggestButtons;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.persist) * 31;
        SuggestButtons suggestButtons = this.suggestButtons;
        int hashCode2 = (hashCode + (suggestButtons == null ? 0 : suggestButtons.hashCode())) * 31;
        LayoutSuggestButtons layoutSuggestButtons = this.layoutSuggestButtons;
        return hashCode2 + (layoutSuggestButtons != null ? layoutSuggestButtons.hashCode() : 0);
    }

    public String toString() {
        return "Suggests(persist=" + this.persist + ", suggestButtons=" + this.suggestButtons + ", layoutSuggestButtons=" + this.layoutSuggestButtons + Extension.C_BRAKE;
    }

    public Suggests(@Json(name = "Persist") boolean z, @Json(name = "SuggestButtons") SuggestButtons suggestButtons, @Json(name = "LayoutSuggestButtons") LayoutSuggestButtons layoutSuggestButtons) {
        this.persist = z;
        this.suggestButtons = suggestButtons;
        this.layoutSuggestButtons = layoutSuggestButtons;
    }

    public Suggests() {
        this(false, null, null, 7, null);
    }
}
