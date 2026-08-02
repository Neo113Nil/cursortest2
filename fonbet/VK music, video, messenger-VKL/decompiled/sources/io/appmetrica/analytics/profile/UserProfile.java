package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC5076oo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes8.dex */
public class UserProfile {
    private final List a;

    public static class Builder {
        private final LinkedList a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC5076oo> userProfileUpdate) {
            this.a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.a, 0);
        }

        private Builder() {
            this.a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC5076oo>> getUserProfileUpdates() {
        return this.a;
    }

    private UserProfile(LinkedList linkedList) {
        this.a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
