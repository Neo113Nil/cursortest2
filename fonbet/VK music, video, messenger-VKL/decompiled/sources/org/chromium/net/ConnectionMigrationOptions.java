package org.chromium.net;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class ConnectionMigrationOptions {

    @Nullable
    private final Boolean mAllowNonDefaultNetworkUsage;

    @Nullable
    private final Boolean mAllowServerMigration;

    @Nullable
    private final Boolean mEnableDefaultNetworkMigration;

    @Nullable
    private final Boolean mEnablePathDegradationMigration;

    @Nullable
    private final Long mIdleMigrationPeriodSeconds;

    @Nullable
    private final Integer mMaxPathDegradingEagerMigrationsCount;

    @Nullable
    private final Long mMaxTimeOnNonDefaultNetworkSeconds;

    @Nullable
    private final Integer mMaxWriteErrorEagerMigrationsCount;

    @Nullable
    private final Boolean mMigrateIdleConnections;

    @Nullable
    private final Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    public static class Builder {

        @Nullable
        private Boolean mAllowNonDefaultNetworkUsage;

        @Nullable
        private Boolean mAllowServerMigration;

        @Nullable
        private Boolean mEnableDefaultNetworkConnectionMigration;

        @Nullable
        private Boolean mEnablePathDegradationMigration;

        @Nullable
        private Long mIdleConnectionMigrationPeriodSeconds;

        @Nullable
        private Integer mMaxPathDegradingEagerMigrationsCount;

        @Nullable
        private Long mMaxTimeOnNonDefaultNetworkSeconds;

        @Nullable
        private Integer mMaxWriteErrorEagerMigrationsCount;

        @Nullable
        private Boolean mMigrateIdleConnections;

        @Nullable
        private Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        public /* synthetic */ Builder(int i) {
            this();
        }

        @Experimental
        public Builder allowNonDefaultNetworkUsage(boolean z) {
            this.mAllowNonDefaultNetworkUsage = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder allowServerMigration(boolean z) {
            this.mAllowServerMigration = Boolean.valueOf(z);
            return this;
        }

        public ConnectionMigrationOptions build() {
            return new ConnectionMigrationOptions(this, 0);
        }

        public Builder enableDefaultNetworkMigration(boolean z) {
            this.mEnableDefaultNetworkConnectionMigration = Boolean.valueOf(z);
            return this;
        }

        public Builder enablePathDegradationMigration(boolean z) {
            this.mEnablePathDegradationMigration = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder migrateIdleConnections(boolean z) {
            this.mMigrateIdleConnections = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean z) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = Boolean.valueOf(z);
            return this;
        }

        @Experimental
        public Builder setIdleConnectionMigrationPeriodSeconds(long j) {
            this.mIdleConnectionMigrationPeriodSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxPathDegradingEagerMigrationsCount = Integer.valueOf(i);
            return this;
        }

        @Experimental
        public Builder setMaxTimeOnNonDefaultNetworkSeconds(long j) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxWriteErrorEagerMigrationsCount = Integer.valueOf(i);
            return this;
        }

        private Builder() {
        }
    }

    public @interface Experimental {
    }

    public /* synthetic */ ConnectionMigrationOptions(Builder builder, int i) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Nullable
    public Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    @Nullable
    public Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    @Nullable
    public Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    @Nullable
    public Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    @Nullable
    public Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    @Nullable
    public Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    @Nullable
    public Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    @Nullable
    public Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    @Nullable
    public Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    @Nullable
    public Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }

    private ConnectionMigrationOptions(Builder builder) {
        this.mEnableDefaultNetworkMigration = builder.mEnableDefaultNetworkConnectionMigration;
        this.mEnablePathDegradationMigration = builder.mEnablePathDegradationMigration;
        this.mAllowServerMigration = builder.mAllowServerMigration;
        this.mMigrateIdleConnections = builder.mMigrateIdleConnections;
        this.mIdleMigrationPeriodSeconds = builder.mIdleConnectionMigrationPeriodSeconds;
        this.mRetryPreHandshakeErrorsOnAlternateNetwork = builder.mRetryPreHandshakeErrorsOnAlternateNetwork;
        this.mAllowNonDefaultNetworkUsage = builder.mAllowNonDefaultNetworkUsage;
        this.mMaxTimeOnNonDefaultNetworkSeconds = builder.mMaxTimeOnNonDefaultNetworkSeconds;
        this.mMaxWriteErrorEagerMigrationsCount = builder.mMaxWriteErrorEagerMigrationsCount;
        this.mMaxPathDegradingEagerMigrationsCount = builder.mMaxPathDegradingEagerMigrationsCount;
    }
}
