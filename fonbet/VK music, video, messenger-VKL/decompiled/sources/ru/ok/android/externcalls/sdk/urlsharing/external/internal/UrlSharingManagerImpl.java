package ru.ok.android.externcalls.sdk.urlsharing.external.internal;

import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: UrlSharingManagerImpl.kt */
/* loaded from: classes9.dex */
public final class UrlSharingManagerImpl implements UrlSharingManager, UrlSharingCommandsExecutor, UrlSharingListenerManager {
    private final UrlSharingCommandsExecutor commandsExecutor;
    private final UrlSharingListenerManager listenerManager;

    public UrlSharingManagerImpl(UrlSharingCommandsExecutor urlSharingCommandsExecutor, UrlSharingListenerManager urlSharingListenerManager) {
        this.commandsExecutor = urlSharingCommandsExecutor;
        this.listenerManager = urlSharingListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager, ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void addListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.addListener(urlSharingListener);
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager, ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void removeListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.removeListener(urlSharingListener);
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager, ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void start(String str, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandsExecutor.start(str, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager, ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor
    public void stop(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandsExecutor.stop(gzsVar, izsVar);
    }
}
