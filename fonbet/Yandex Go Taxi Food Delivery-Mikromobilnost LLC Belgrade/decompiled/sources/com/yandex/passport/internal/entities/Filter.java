package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportParameterRule;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.r1;
import com.yandex.passport.api.s1;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.y0;
import com.yandex.passport.api.z0;
import com.yandex.passport.common.bitflag.EnumFlagHolder;
import com.yandex.passport.data.models.ParameterRule;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.nea1;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002bcBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0016\"\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÀ\u0003¢\u0006\u0004\b'\u0010(JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b.\u0010!J\u001a\u00101\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010#R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R \u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010&R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010(R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020?0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010(R\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010GR\u001a\u0010M\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010GR\u001a\u0010P\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bO\u0010<\u001a\u0004\bN\u0010GR\u001a\u0010S\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bR\u0010<\u001a\u0004\bQ\u0010GR\u001a\u0010V\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bU\u0010<\u001a\u0004\bT\u0010GR\u001a\u0010Y\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\bX\u0010<\u001a\u0004\bW\u0010GR\u001a\u0010\\\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b[\u0010<\u001a\u0004\bZ\u0010GR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00070]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006d"}, d2 = {"Lcom/yandex/passport/internal/entities/Filter;", "Lcom/yandex/passport/api/z0;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "primaryEnvironment", "secondaryTeamEnvironment", "Lcom/yandex/passport/common/bitflag/EnumFlagHolder;", "Lcom/yandex/passport/api/PassportAccountType;", "flagHolder", "Lcom/yandex/passport/api/s1;", "partitions", "", "", "Lcom/yandex/passport/data/models/ParameterRule;", "internalFilterRules", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/common/bitflag/EnumFlagHolder;Lcom/yandex/passport/api/s1;Ljava/util/Map;)V", "accountType", "", "get", "(Lcom/yandex/passport/api/PassportAccountType;)Z", "isOnlySupported", "", "anyOf", "([Lcom/yandex/passport/api/PassportAccountType;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "component4", "()Lcom/yandex/passport/api/s1;", "component5$passport_release", "()Ljava/util/Map;", "component5", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Lcom/yandex/passport/common/bitflag/EnumFlagHolder;Lcom/yandex/passport/api/s1;Ljava/util/Map;)Lcom/yandex/passport/internal/entities/Filter;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component3", "()Lcom/yandex/passport/common/bitflag/EnumFlagHolder;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getPrimaryEnvironment", "getSecondaryTeamEnvironment", "Lcom/yandex/passport/common/bitflag/EnumFlagHolder;", "Lcom/yandex/passport/api/s1;", "getPartitions", "getPartitions$annotations", "()V", "Ljava/util/Map;", "getInternalFilterRules$passport_release", "Lcom/yandex/passport/api/PassportParameterRule;", "getFilterRules", "filterRules", "Lcom/yandex/passport/api/t0;", "getTeamEnvironmentIfSpecified", "()Lcom/yandex/passport/api/t0;", "teamEnvironmentIfSpecified", "isLiteRegistrationAllowed", "()Z", "getOnlyPhonish", "getOnlyPhonish$annotations", "onlyPhonish", "getOnlyPdd", "getOnlyPdd$annotations", "onlyPdd", "getIncludePhonish", "getIncludePhonish$annotations", "includePhonish", "getIncludeMailish", "getIncludeMailish$annotations", "includeMailish", "getExcludeSocial", "getExcludeSocial$annotations", "excludeSocial", "getExcludeLite", "getExcludeLite$annotations", "excludeLite", "getIncludeMusicPhonish", "getIncludeMusicPhonish$annotations", "includeMusicPhonish", "Ljava/util/EnumSet;", "getSupportedAccountTypes", "()Ljava/util/EnumSet;", "supportedAccountTypes", "Companion", "a", "com/yandex/passport/internal/entities/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Filter implements z0, Parcelable {
    public static final int $stable = 8;
    private final EnumFlagHolder<PassportAccountType> flagHolder;
    private final Map<String, ParameterRule> internalFilterRules;
    private final s1 partitions;
    private final PassportEnvironmentImpl primaryEnvironment;
    private final PassportEnvironmentImpl secondaryTeamEnvironment;
    public static final f Companion = new f();
    public static final Parcelable.Creator<Filter> CREATOR = new Creator();

    public static final class a implements y0 {
        public KPassportEnvironment a;
        public KPassportEnvironment b;
        public s1 c;
        public Map w;
        public final EnumFlagHolder x;

        public a() {
            s1.v5.getClass();
            this.c = r1.b;
            this.w = kotlin.collections.b.f();
            this.x = new EnumFlagHolder(PassportAccountType.PORTAL, PassportAccountType.SOCIAL, PassportAccountType.LITE, PassportAccountType.PDD, PassportAccountType.UNDEFINED);
        }

        public final Filter a() {
            KPassportEnvironment kPassportEnvironment = this.a;
            if (kPassportEnvironment == null) {
                nea1.b("You must set Primary Environment");
                throw null;
            }
            PassportEnvironmentImpl from = PassportEnvironmentImpl.from(kPassportEnvironment);
            KPassportEnvironment kPassportEnvironment2 = this.b;
            PassportEnvironmentImpl from2 = kPassportEnvironment2 != null ? PassportEnvironmentImpl.from(kPassportEnvironment2) : null;
            if (from2 == null || (!from.isTeam() && from2.isTeam())) {
                Filter.Companion.getClass();
                return f.a(this);
            }
            nea1.b("You must set non-team as primary environment and team as secondary environment");
            throw null;
        }

        public final void b(PassportAccountType... passportAccountTypeArr) {
            for (PassportAccountType passportAccountType : passportAccountTypeArr) {
                this.x.set(passportAccountType, false);
            }
        }

        public final void c(PassportAccountType... passportAccountTypeArr) {
            for (PassportAccountType passportAccountType : passportAccountTypeArr) {
                this.x.set(passportAccountType, true);
            }
        }

        public final void d(Filter filter) {
            if (filter != null) {
                EnumFlagHolder enumFlagHolder = this.x;
                enumFlagHolder.reset();
                t0 primaryEnvironment = filter.getPrimaryEnvironment();
                KPassportEnvironment.Companion.getClass();
                this.a = com.yandex.passport.api.d.a(primaryEnvironment);
                t0 secondaryTeamEnvironment = filter.getSecondaryTeamEnvironment();
                this.b = secondaryTeamEnvironment != null ? com.yandex.passport.api.d.a(secondaryTeamEnvironment) : null;
                Iterator it = filter.getSupportedAccountTypes().iterator();
                while (it.hasNext()) {
                    enumFlagHolder.set((PassportAccountType) it.next());
                }
                this.c = filter.getPartitions();
                this.w = filter.getFilterRules();
            }
        }

        public final void e(t0 t0Var) {
            KPassportEnvironment.Companion.getClass();
            this.a = com.yandex.passport.api.d.a(t0Var);
        }

        @Override // com.yandex.passport.api.z0
        public final Map getFilterRules() {
            return this.w;
        }

        @Override // com.yandex.passport.api.z0
        public final s1 getPartitions() {
            return this.c;
        }

        @Override // com.yandex.passport.api.z0
        public final t0 getPrimaryEnvironment() {
            KPassportEnvironment kPassportEnvironment = this.a;
            if (kPassportEnvironment != null) {
                return kPassportEnvironment;
            }
            return null;
        }

        @Override // com.yandex.passport.api.z0
        public final t0 getSecondaryTeamEnvironment() {
            return this.b;
        }

        @Override // com.yandex.passport.api.z0
        public final EnumSet getSupportedAccountTypes() {
            PassportAccountType[] values = PassportAccountType.values();
            ArrayList arrayList = new ArrayList();
            for (PassportAccountType passportAccountType : values) {
                if (this.x.getWrapped().m245getOMiyNp0(passportAccountType.getValue())) {
                    arrayList.add(passportAccountType);
                }
            }
            EnumSet noneOf = EnumSet.noneOf(PassportAccountType.class);
            noneOf.addAll(arrayList);
            return noneOf;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Filter(PassportEnvironmentImpl passportEnvironmentImpl, PassportEnvironmentImpl passportEnvironmentImpl2, EnumFlagHolder enumFlagHolder, s1 s1Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportEnvironmentImpl, r2, enumFlagHolder, s1Var, (i & 16) != 0 ? kotlin.collections.b.f() : map);
        PassportEnvironmentImpl passportEnvironmentImpl3 = (i & 2) != 0 ? null : passportEnvironmentImpl2;
        if ((i & 8) != 0) {
            s1.v5.getClass();
            s1Var = r1.b;
        }
    }

    private final EnumFlagHolder<PassportAccountType> component3() {
        return this.flagHolder;
    }

    public static /* synthetic */ Filter copy$default(Filter filter, PassportEnvironmentImpl passportEnvironmentImpl, PassportEnvironmentImpl passportEnvironmentImpl2, EnumFlagHolder enumFlagHolder, s1 s1Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            passportEnvironmentImpl = filter.primaryEnvironment;
        }
        if ((i & 2) != 0) {
            passportEnvironmentImpl2 = filter.secondaryTeamEnvironment;
        }
        if ((i & 4) != 0) {
            enumFlagHolder = filter.flagHolder;
        }
        if ((i & 8) != 0) {
            s1Var = filter.partitions;
        }
        if ((i & 16) != 0) {
            map = filter.internalFilterRules;
        }
        Map map2 = map;
        EnumFlagHolder enumFlagHolder2 = enumFlagHolder;
        return filter.copy(passportEnvironmentImpl, passportEnvironmentImpl2, enumFlagHolder2, s1Var, map2);
    }

    @jxi
    public static /* synthetic */ void getExcludeLite$annotations() {
    }

    @jxi
    public static /* synthetic */ void getExcludeSocial$annotations() {
    }

    @jxi
    public static /* synthetic */ void getIncludeMailish$annotations() {
    }

    @jxi
    public static /* synthetic */ void getIncludeMusicPhonish$annotations() {
    }

    @jxi
    public static /* synthetic */ void getIncludePhonish$annotations() {
    }

    @jxi
    public static /* synthetic */ void getOnlyPdd$annotations() {
    }

    @jxi
    public static /* synthetic */ void getOnlyPhonish$annotations() {
    }

    public static /* synthetic */ void getPartitions$annotations() {
    }

    public final boolean anyOf(PassportAccountType... accountType) {
        for (PassportAccountType passportAccountType : accountType) {
            if (this.flagHolder.get(passportAccountType)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getPrimaryEnvironment() {
        return this.primaryEnvironment;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportEnvironmentImpl getSecondaryTeamEnvironment() {
        return this.secondaryTeamEnvironment;
    }

    /* renamed from: component4, reason: from getter */
    public final s1 getPartitions() {
        return this.partitions;
    }

    public final Map<String, ParameterRule> component5$passport_release() {
        return this.internalFilterRules;
    }

    public final Filter copy(PassportEnvironmentImpl primaryEnvironment, PassportEnvironmentImpl secondaryTeamEnvironment, EnumFlagHolder<PassportAccountType> flagHolder, s1 partitions, Map<String, ParameterRule> internalFilterRules) {
        return new Filter(primaryEnvironment, secondaryTeamEnvironment, flagHolder, partitions, internalFilterRules);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) other;
        return jl40.l(this.primaryEnvironment, filter.primaryEnvironment) && jl40.l(this.secondaryTeamEnvironment, filter.secondaryTeamEnvironment) && jl40.l(this.flagHolder, filter.flagHolder) && jl40.l(this.partitions, filter.partitions) && jl40.l(this.internalFilterRules, filter.internalFilterRules);
    }

    public boolean get(PassportAccountType accountType) {
        return this.flagHolder.get(accountType);
    }

    public boolean getExcludeLite() {
        return !get(PassportAccountType.LITE);
    }

    public boolean getExcludeSocial() {
        return !get(PassportAccountType.SOCIAL);
    }

    @Override // com.yandex.passport.api.z0
    public Map<String, PassportParameterRule> getFilterRules() {
        Map<String, ParameterRule> map = this.internalFilterRules;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), h.a((ParameterRule) entry.getValue()));
        }
        return linkedHashMap;
    }

    public boolean getIncludeMailish() {
        return get(PassportAccountType.MAILISH);
    }

    public boolean getIncludeMusicPhonish() {
        return get(PassportAccountType.MUSIC_PHONISH);
    }

    public boolean getIncludePhonish() {
        return get(PassportAccountType.PHONISH);
    }

    public final Map<String, ParameterRule> getInternalFilterRules$passport_release() {
        return this.internalFilterRules;
    }

    public boolean getOnlyPdd() {
        return isOnlySupported(PassportAccountType.PDD);
    }

    public boolean getOnlyPhonish() {
        return isOnlySupported(PassportAccountType.PHONISH);
    }

    @Override // com.yandex.passport.api.z0
    public s1 getPartitions() {
        return this.partitions;
    }

    @Override // com.yandex.passport.api.z0
    public EnumSet<PassportAccountType> getSupportedAccountTypes() {
        EnumFlagHolder<PassportAccountType> enumFlagHolder = this.flagHolder;
        PassportAccountType[] values = PassportAccountType.values();
        ArrayList arrayList = new ArrayList();
        for (PassportAccountType passportAccountType : values) {
            if (enumFlagHolder.getWrapped().m245getOMiyNp0(passportAccountType.getValue())) {
                arrayList.add(passportAccountType);
            }
        }
        EnumSet<PassportAccountType> noneOf = EnumSet.noneOf(PassportAccountType.class);
        noneOf.addAll(arrayList);
        return noneOf;
    }

    public final t0 getTeamEnvironmentIfSpecified() {
        return getPrimaryEnvironment().isTeam() ? getPrimaryEnvironment() : getSecondaryTeamEnvironment();
    }

    public int hashCode() {
        int hashCode = this.primaryEnvironment.hashCode() * 31;
        PassportEnvironmentImpl passportEnvironmentImpl = this.secondaryTeamEnvironment;
        return this.internalFilterRules.hashCode() + ((this.partitions.hashCode() + ((this.flagHolder.hashCode() + ((hashCode + (passportEnvironmentImpl == null ? 0 : passportEnvironmentImpl.hashCode())) * 31)) * 31)) * 31);
    }

    public final boolean isLiteRegistrationAllowed() {
        return get(PassportAccountType.LITE);
    }

    public boolean isOnlySupported(PassportAccountType accountType) {
        EnumFlagHolder<PassportAccountType> enumFlagHolder = this.flagHolder;
        PassportAccountType[] values = PassportAccountType.values();
        ArrayList arrayList = new ArrayList();
        for (PassportAccountType passportAccountType : values) {
            if (enumFlagHolder.getWrapped().m245getOMiyNp0(passportAccountType.getValue())) {
                arrayList.add(passportAccountType);
            }
        }
        EnumSet noneOf = EnumSet.noneOf(PassportAccountType.class);
        noneOf.addAll(arrayList);
        return noneOf.size() == 1 && kotlin.collections.a.O(noneOf) == accountType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Filter(primaryEnvironment=");
        sb.append(this.primaryEnvironment);
        sb.append(", secondaryTeamEnvironment=");
        sb.append(this.secondaryTeamEnvironment);
        sb.append(", flagHolder=");
        sb.append(this.flagHolder);
        sb.append(", partitions=");
        sb.append(this.partitions);
        sb.append(", internalFilterRules=");
        return smw0.n(sb, this.internalFilterRules, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.primaryEnvironment, flags);
        dest.writeParcelable(this.secondaryTeamEnvironment, flags);
        this.flagHolder.writeToParcel(dest, flags);
        s1 s1Var = this.partitions;
        ArrayList arrayList = new ArrayList(tcc.n(s1Var, 10));
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportPartition) it.next()).m240unboximpl());
        }
        dest.writeStringList(arrayList);
        Iterator x = qv10.x(this.internalFilterRules, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Filter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Filter createFromParcel(Parcel parcel) {
            PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) parcel.readParcelable(Filter.class.getClassLoader());
            PassportEnvironmentImpl passportEnvironmentImpl2 = (PassportEnvironmentImpl) parcel.readParcelable(Filter.class.getClassLoader());
            EnumFlagHolder<?> createFromParcel = EnumFlagHolder.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(PassportPartition.m231boximpl(PassportPartition.m232constructorimpl((String) it.next())));
            }
            Partitions partitions = new Partitions(arrayList2);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(Filter.class.getClassLoader()));
            }
            return new Filter(passportEnvironmentImpl, passportEnvironmentImpl2, createFromParcel, partitions, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Filter[] newArray(int i) {
            return new Filter[i];
        }
    }

    @Override // com.yandex.passport.api.z0
    public PassportEnvironmentImpl getPrimaryEnvironment() {
        return this.primaryEnvironment;
    }

    @Override // com.yandex.passport.api.z0
    public PassportEnvironmentImpl getSecondaryTeamEnvironment() {
        return this.secondaryTeamEnvironment;
    }

    public Filter(PassportEnvironmentImpl passportEnvironmentImpl, PassportEnvironmentImpl passportEnvironmentImpl2, EnumFlagHolder<PassportAccountType> enumFlagHolder, s1 s1Var, Map<String, ParameterRule> map) {
        this.primaryEnvironment = passportEnvironmentImpl;
        this.secondaryTeamEnvironment = passportEnvironmentImpl2;
        this.flagHolder = enumFlagHolder;
        this.partitions = s1Var;
        this.internalFilterRules = map;
    }
}
