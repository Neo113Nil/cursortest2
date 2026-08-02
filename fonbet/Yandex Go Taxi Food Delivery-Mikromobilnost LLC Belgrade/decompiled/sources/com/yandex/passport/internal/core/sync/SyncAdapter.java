package com.yandex.passport.internal.core.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.data.exceptions.FailedResponseException;
import java.io.IOException;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/passport/internal/core/sync/SyncAdapter;", "Landroid/content/AbstractThreadedSyncAdapter;", "Landroid/content/Context;", "applicationContext", "Lcom/yandex/passport/internal/core/accounts/a;", "accountSynchronizer", "<init>", "(Landroid/content/Context;Lcom/yandex/passport/internal/core/accounts/a;)V", "Landroid/accounts/Account;", "account", "Landroid/content/SyncResult;", "syncResult", "", "isForced", "Lzy11;", "performSync", "(Landroid/accounts/Account;Landroid/content/SyncResult;Z)V", "Landroid/os/Bundle;", "extras", "", "authority", "Landroid/content/ContentProviderClient;", "provider", "onPerformSync", "(Landroid/accounts/Account;Landroid/os/Bundle;Ljava/lang/String;Landroid/content/ContentProviderClient;Landroid/content/SyncResult;)V", "Lcom/yandex/passport/internal/core/accounts/a;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncAdapter extends AbstractThreadedSyncAdapter {
    public static final int $stable = 8;
    private final com.yandex.passport.internal.core.accounts.a accountSynchronizer;

    public SyncAdapter(Context context, com.yandex.passport.internal.core.accounts.a aVar) {
        super(context, false, true);
        this.accountSynchronizer = aVar;
    }

    private final void performSync(Account account, SyncResult syncResult, boolean isForced) {
        if (!this.accountSynchronizer.a(account, isForced)) {
            syncResult.stats.numSkippedEntries++;
        } else {
            SyncStats syncStats = syncResult.stats;
            syncStats.numUpdates++;
            syncStats.numEntries++;
        }
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onPerformSync: started; account=" + account + " extras=" + extras + " authority=" + authority + " provider=" + provider + " syncResult=" + syncResult, 8);
        }
        try {
            try {
                try {
                    performSync(account, syncResult, extras.getBoolean("force"));
                } catch (InvalidTokenException e) {
                    syncResult.stats.numAuthExceptions++;
                    c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "onPerformSync: master token became invalid for " + account, e);
                    }
                } catch (IOException e2) {
                    syncResult.stats.numIoExceptions++;
                    c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "onPerformSync: synchronizing failed " + account, e2);
                    }
                }
            } catch (FailedResponseException e3) {
                syncResult.stats.numParseExceptions++;
                c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "onPerformSync: synchronizing failed " + account, e3);
                }
            } catch (JSONException e4) {
                syncResult.stats.numParseExceptions++;
                c cVar5 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "onPerformSync: synchronizing failed " + account, e4);
                }
            }
        } catch (Exception e5) {
            c cVar6 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "onPerformSync: unexpected exception", e5);
            }
        }
        c cVar7 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onPerformSync: finished; account=" + account, 8);
        }
    }
}
