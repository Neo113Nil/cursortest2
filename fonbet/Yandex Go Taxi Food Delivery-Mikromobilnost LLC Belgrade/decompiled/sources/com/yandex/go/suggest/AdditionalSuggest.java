package com.yandex.go.suggest;

import defpackage.al0;
import defpackage.bl0;
import defpackage.dl0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.ol0;
import defpackage.ql0;
import defpackage.sk0;
import defpackage.uk0;
import defpackage.vk0;
import defpackage.xk0;
import defpackage.yjd;
import defpackage.yk0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u0001:\u000278R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\b\u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\b\u001a\u0004\b'\u0010(R\"\u0010*\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010(R\"\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010\b\u001a\u0004\b0\u00101R\"\u00103\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010 \u0012\u0004\b5\u0010\b\u001a\u0004\b4\u0010\"¨\u00069"}, d2 = {"Lcom/yandex/go/suggest/AdditionalSuggest;", "Lcom/yandex/go/suggest/DestinationSuggest;", "", "id", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getId$annotations", "()V", "", "itemIndex", "Ljava/lang/Integer;", "getItemIndex", "()Ljava/lang/Integer;", "getItemIndex$annotations", "groupId", "getGroupId", "getGroupId$annotations", "Luk0;", "action", "Luk0;", "a", "()Luk0;", "getAction$annotations", "Lxk0;", "analytics", "Lxk0;", "b", "()Lxk0;", "getAnalytics$annotations", "Lql0;", "lead", "Lql0;", "f", "()Lql0;", "getLead$annotations", "Lal0;", "leadBody", "Lal0;", "g", "()Lal0;", "getLeadBody$annotations", "trailBody", CoreConstants.PushMessage.SERVICE_TYPE, "getTrailBody$annotations", "Ldl0;", "trailButton", "Ldl0;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "()Ldl0;", "getTrailButton$annotations", "trail", "h", "getTrail$annotations", "Companion", "com/yandex/go/suggest/a", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdditionalSuggest implements DestinationSuggest {
    public static final a Companion = new a();
    public static final AdditionalSuggest a = new AdditionalSuggest(0);
    private final uk0 action;
    private final xk0 analytics;
    private final Integer groupId;
    private final String id;
    private final Integer itemIndex;
    private final ql0 lead;
    private final al0 leadBody;
    private final ql0 trail;
    private final al0 trailBody;
    private final dl0 trailButton;

    public /* synthetic */ AdditionalSuggest(int i, String str, Integer num, Integer num2, uk0 uk0Var, xk0 xk0Var, ql0 ql0Var, al0 al0Var, al0 al0Var2, dl0 dl0Var, ql0 ql0Var2) {
        this.id = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.itemIndex = null;
        } else {
            this.itemIndex = num;
        }
        if ((i & 4) == 0) {
            this.groupId = null;
        } else {
            this.groupId = num2;
        }
        if ((i & 8) == 0) {
            this.action = null;
        } else {
            this.action = uk0Var;
        }
        if ((i & 16) == 0) {
            this.analytics = null;
        } else {
            this.analytics = xk0Var;
        }
        if ((i & 32) == 0) {
            this.lead = null;
        } else {
            this.lead = ql0Var;
        }
        if ((i & 64) == 0) {
            this.leadBody = null;
        } else {
            this.leadBody = al0Var;
        }
        if ((i & 128) == 0) {
            this.trailBody = null;
        } else {
            this.trailBody = al0Var2;
        }
        if ((i & 256) == 0) {
            this.trailButton = null;
        } else {
            this.trailButton = dl0Var;
        }
        if ((i & 512) == 0) {
            this.trail = null;
        } else {
            this.trail = ql0Var2;
        }
    }

    public static final /* synthetic */ void k(AdditionalSuggest additionalSuggest, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(additionalSuggest.id, "")) {
            yjdVar.o(serialDescriptor, 0, additionalSuggest.id);
        }
        if (yjdVar.F() || additionalSuggest.itemIndex != null) {
            yjdVar.g(serialDescriptor, 1, h6w.a, additionalSuggest.itemIndex);
        }
        if (yjdVar.F() || additionalSuggest.groupId != null) {
            yjdVar.g(serialDescriptor, 2, h6w.a, additionalSuggest.groupId);
        }
        if (yjdVar.F() || additionalSuggest.action != null) {
            yjdVar.g(serialDescriptor, 3, sk0.a, additionalSuggest.action);
        }
        if (yjdVar.F() || additionalSuggest.analytics != null) {
            yjdVar.g(serialDescriptor, 4, vk0.a, additionalSuggest.analytics);
        }
        if (yjdVar.F() || additionalSuggest.lead != null) {
            yjdVar.g(serialDescriptor, 5, ol0.a, additionalSuggest.lead);
        }
        if (yjdVar.F() || additionalSuggest.leadBody != null) {
            yjdVar.g(serialDescriptor, 6, yk0.a, additionalSuggest.leadBody);
        }
        if (yjdVar.F() || additionalSuggest.trailBody != null) {
            yjdVar.g(serialDescriptor, 7, yk0.a, additionalSuggest.trailBody);
        }
        if (yjdVar.F() || additionalSuggest.trailButton != null) {
            yjdVar.g(serialDescriptor, 8, bl0.a, additionalSuggest.trailButton);
        }
        if (!yjdVar.F() && additionalSuggest.trail == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 9, ol0.a, additionalSuggest.trail);
    }

    /* renamed from: a, reason: from getter */
    public final uk0 getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final xk0 getAnalytics() {
        return this.analytics;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: f, reason: from getter */
    public final ql0 getLead() {
        return this.lead;
    }

    /* renamed from: g, reason: from getter */
    public final al0 getLeadBody() {
        return this.leadBody;
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    /* renamed from: h, reason: from getter */
    public final ql0 getTrail() {
        return this.trail;
    }

    /* renamed from: i, reason: from getter */
    public final al0 getTrailBody() {
        return this.trailBody;
    }

    /* renamed from: j, reason: from getter */
    public final dl0 getTrailButton() {
        return this.trailButton;
    }

    public AdditionalSuggest() {
        this(0);
    }

    public AdditionalSuggest(uk0 uk0Var, xk0 xk0Var, al0 al0Var, al0 al0Var2, dl0 dl0Var, ql0 ql0Var, ql0 ql0Var2, Integer num, Integer num2, String str) {
        this.id = str;
        this.itemIndex = num;
        this.groupId = num2;
        this.action = uk0Var;
        this.analytics = xk0Var;
        this.lead = ql0Var;
        this.leadBody = al0Var;
        this.trailBody = al0Var2;
        this.trailButton = dl0Var;
        this.trail = ql0Var2;
    }

    public /* synthetic */ AdditionalSuggest(int i) {
        this(null, null, null, null, null, null, null, null, null, "");
    }
}
