package com.yandex.go.external_service.preloader.data.models;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/external_service/preloader/data/models/RepositoryConfiguration$BundleStrategy", "", "Lcom/yandex/go/external_service/preloader/data/models/RepositoryConfiguration$BundleStrategy;", "NORMAL", PreloadEventTracker.PRELOAD_ERROR_CATEGORY, "IGNORE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RepositoryConfiguration$BundleStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RepositoryConfiguration$BundleStrategy[] $VALUES;
    public static final RepositoryConfiguration$BundleStrategy IGNORE;
    public static final RepositoryConfiguration$BundleStrategy NORMAL;
    public static final RepositoryConfiguration$BundleStrategy PRELOAD;

    static {
        RepositoryConfiguration$BundleStrategy repositoryConfiguration$BundleStrategy = new RepositoryConfiguration$BundleStrategy("NORMAL", 0);
        NORMAL = repositoryConfiguration$BundleStrategy;
        RepositoryConfiguration$BundleStrategy repositoryConfiguration$BundleStrategy2 = new RepositoryConfiguration$BundleStrategy(PreloadEventTracker.PRELOAD_ERROR_CATEGORY, 1);
        PRELOAD = repositoryConfiguration$BundleStrategy2;
        RepositoryConfiguration$BundleStrategy repositoryConfiguration$BundleStrategy3 = new RepositoryConfiguration$BundleStrategy("IGNORE", 2);
        IGNORE = repositoryConfiguration$BundleStrategy3;
        RepositoryConfiguration$BundleStrategy[] repositoryConfiguration$BundleStrategyArr = {repositoryConfiguration$BundleStrategy, repositoryConfiguration$BundleStrategy2, repositoryConfiguration$BundleStrategy3};
        $VALUES = repositoryConfiguration$BundleStrategyArr;
        $ENTRIES = kotlin.enums.a.a(repositoryConfiguration$BundleStrategyArr);
    }

    public static RepositoryConfiguration$BundleStrategy valueOf(String str) {
        return (RepositoryConfiguration$BundleStrategy) Enum.valueOf(RepositoryConfiguration$BundleStrategy.class, str);
    }

    public static RepositoryConfiguration$BundleStrategy[] values() {
        return (RepositoryConfiguration$BundleStrategy[]) $VALUES.clone();
    }
}
