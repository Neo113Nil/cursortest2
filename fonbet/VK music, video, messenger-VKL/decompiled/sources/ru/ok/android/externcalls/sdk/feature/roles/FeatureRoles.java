package ru.ok.android.externcalls.sdk.feature.roles;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;
import xsna.zcl;

/* compiled from: FeatureRoles.kt */
/* loaded from: classes9.dex */
public abstract class FeatureRoles {
    public static final Companion Companion = new Companion(null);

    /* compiled from: FeatureRoles.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final EnabledForRoles createDisabledForAll() {
            return new EnabledForRoles(EmptySet.b);
        }

        private Companion() {
        }
    }

    /* compiled from: FeatureRoles.kt */
    public static final class EnabledForAll extends FeatureRoles {
        public static final EnabledForAll INSTANCE = new EnabledForAll();

        private EnabledForAll() {
            super(null);
        }
    }

    /* compiled from: FeatureRoles.kt */
    public static final class EnabledForRoles extends FeatureRoles {
        private final Set<CallParticipant.Role> roles;

        /* JADX WARN: Multi-variable type inference failed */
        public EnabledForRoles(Set<? extends CallParticipant.Role> set) {
            super(null);
            this.roles = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EnabledForRoles copy$default(EnabledForRoles enabledForRoles, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = enabledForRoles.roles;
            }
            return enabledForRoles.copy(set);
        }

        public final Set<CallParticipant.Role> component1() {
            return this.roles;
        }

        public final EnabledForRoles copy(Set<? extends CallParticipant.Role> set) {
            return new EnabledForRoles(set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EnabledForRoles) && epx.f(this.roles, ((EnabledForRoles) obj).roles);
        }

        public final Set<CallParticipant.Role> getRoles() {
            return this.roles;
        }

        public int hashCode() {
            return this.roles.hashCode();
        }

        public String toString() {
            return "EnabledForRoles(roles=" + this.roles + ")";
        }
    }

    public /* synthetic */ FeatureRoles(zcl zclVar) {
        this();
    }

    private FeatureRoles() {
    }
}
