package com.yandex.passport.internal.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.GetChildrenInfoRequest$Member;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.v;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tcc;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 |2\u00020\u0001:\u0001}BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020#¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\u0015\u0010-\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b-\u00100J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00100J\u001d\u00109\u001a\u00020\u00152\u0006\u00108\u001a\u0002072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00152\u0006\u0010;\u001a\u000207¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u0004\u0018\u00010>2\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bE\u0010DJ\u0015\u0010F\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010DJ\u0017\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020#2\u0006\u0010J\u001a\u00020G¢\u0006\u0004\bK\u0010LJ#\u0010Q\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u00022\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N¢\u0006\u0004\bQ\u0010RJ\u001b\u0010T\u001a\b\u0012\u0004\u0012\u00020S0N2\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bV\u00100J\u0015\u0010W\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001f0N¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0015H\u0002¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010_R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010`R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0017\u0010c\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0017\u0010w\u001a\b\u0012\u0004\u0012\u0002070N8F¢\u0006\u0006\u001a\u0004\bv\u0010ZR\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020A0N8F¢\u0006\u0006\u001a\u0004\bx\u0010ZR\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020G0N8F¢\u0006\u0006\u001a\u0004\bz\u0010Z¨\u0006~"}, d2 = {"Lcom/yandex/passport/internal/database/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "databaseName", "", "databaseVersion", "Landroid/content/Context;", "context", "Lcom/yandex/passport/internal/usecase/k;", "commonEncryptUseCase", "Lcom/yandex/passport/internal/usecase/j;", "commonDecryptUseCase", "Lcom/yandex/passport/internal/network/mappers/h;", "accountMapper", "Lcom/yandex/passport/internal/flags/j;", "flagRepository", "<init>", "(Ljava/lang/String;ILandroid/content/Context;Lcom/yandex/passport/internal/usecase/k;Lcom/yandex/passport/internal/usecase/j;Lcom/yandex/passport/internal/network/mappers/h;Lcom/yandex/passport/internal/flags/j;)V", "(Landroid/content/Context;Lcom/yandex/passport/internal/usecase/k;Lcom/yandex/passport/internal/usecase/j;Lcom/yandex/passport/internal/network/mappers/h;Lcom/yandex/passport/internal/flags/j;)V", "Landroid/database/sqlite/SQLiteDatabase;", "database", "Lzy11;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "onDowngrade", "getReadableDatabase", "()Landroid/database/sqlite/SQLiteDatabase;", "Lcom/yandex/passport/common/core/Uid;", "uid", "Lcom/yandex/passport/internal/entities/ClientToken;", "clientToken", "", "putClientToken", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/internal/entities/ClientToken;)J", "decryptedClientId", "getClientToken", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/ClientToken;", "getClientTokenValue", "(Lcom/yandex/passport/common/core/Uid;)Ljava/lang/String;", "countClientTokens", "()J", "dropClientToken", "(Lcom/yandex/passport/common/core/Uid;)V", "tokenValue", "(Ljava/lang/String;)V", "Lcom/yandex/passport/internal/a;", "accountsDifference", "mergeAccountRows", "(Lcom/yandex/passport/internal/a;)V", "name", "deleteAccountRow", "Lcom/yandex/passport/internal/AccountRow;", "account", "insertDelayedAccount", "(Lcom/yandex/passport/internal/AccountRow;Lcom/yandex/passport/common/core/Uid;)V", "newAccountRow", "updateDelayedAccount", "(Lcom/yandex/passport/internal/AccountRow;)V", "Lcom/yandex/passport/internal/ModernAccount;", "findAccountByName", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ModernAccount;", "Lcom/yandex/passport/internal/v;", "revocation", "insertRevocation", "(Lcom/yandex/passport/internal/v;)V", "increaseRevocationAttempts", "deleteRevocation", "Lcom/yandex/passport/internal/sso/a;", "getLastAction", "(Lcom/yandex/passport/common/core/Uid;)Lcom/yandex/passport/internal/sso/a;", "accountAction", "addOrUpdateAccountLastAction", "(Lcom/yandex/passport/internal/sso/a;)J", "parentName", "", "Lcom/yandex/passport/data/network/GetChildrenInfoRequest$Member;", "children", "updateChildren", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/yandex/passport/internal/database/c;", "getChildren", "(Ljava/lang/String;)Ljava/util/List;", "deleteAllChildren", "deleteDelayedUid", "(Lcom/yandex/passport/common/core/Uid;)I", "getAllDelayedUids", "()Ljava/util/List;", "createDatabaseDirIfNeed", "()V", "Landroid/content/Context;", "Lcom/yandex/passport/internal/usecase/k;", "Lcom/yandex/passport/internal/usecase/j;", "Lcom/yandex/passport/internal/network/mappers/h;", "Lcom/yandex/passport/internal/flags/j;", "Lcom/yandex/passport/internal/database/n;", "tokensDao", "Lcom/yandex/passport/internal/database/n;", "getTokensDao", "()Lcom/yandex/passport/internal/database/n;", "Lcom/yandex/passport/internal/database/f;", "delayedAccountUidsDao", "Lcom/yandex/passport/internal/database/f;", "Lcom/yandex/passport/internal/database/a;", "accountsDao", "Lcom/yandex/passport/internal/database/a;", "Lcom/yandex/passport/internal/database/l;", "revocationsDao", "Lcom/yandex/passport/internal/database/l;", "Lcom/yandex/passport/internal/database/m;", "ssoDao", "Lcom/yandex/passport/internal/database/m;", "Lcom/yandex/passport/internal/database/d;", "childrenDao", "Lcom/yandex/passport/internal/database/d;", "getAccountRows", "accountRows", "getRevocations", "revocations", "getAccountsLastActions", "accountsLastActions", "Companion", "com/yandex/passport/internal/database/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {
    public static final int $stable = 8;
    public static final long BAD_ROWID = -1;
    public static final String COLUMN_NAME_UID = "uid";
    public static final e Companion = new e();
    private static final String DATABASE_NAME = "PassportInternal.db";
    public static final int DATABASE_VERSION = 13;
    public static final String SQL_DELETE_EXTRA_UIDS_FOR_SUBSCRIPTION_TABLE = "DROP TABLE IF EXISTS extra_uids_for_subscription";
    private final com.yandex.passport.internal.network.mappers.h accountMapper;
    private final a accountsDao;
    private final d childrenDao;
    private final com.yandex.passport.internal.usecase.j commonDecryptUseCase;
    private final com.yandex.passport.internal.usecase.k commonEncryptUseCase;
    private final Context context;
    private final f delayedAccountUidsDao;
    private final com.yandex.passport.internal.flags.j flagRepository;
    private final l revocationsDao;
    private final m ssoDao;
    private final n tokensDao;

    public DatabaseHelper(String str, int i, Context context, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.j jVar, com.yandex.passport.internal.network.mappers.h hVar, com.yandex.passport.internal.flags.j jVar2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.context = context;
        this.commonEncryptUseCase = kVar;
        this.commonDecryptUseCase = jVar;
        this.accountMapper = hVar;
        this.flagRepository = jVar2;
        n nVar = new n(new DatabaseHelper$tokensDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$tokensDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0));
        this.tokensDao = nVar;
        f fVar = new f(new DatabaseHelper$delayedAccountUidsDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$delayedAccountUidsDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0));
        this.delayedAccountUidsDao = fVar;
        this.accountsDao = new a(new DatabaseHelper$accountsDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$accountsDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), nVar, fVar, kVar, jVar, hVar, jVar2);
        this.revocationsDao = new l(new DatabaseHelper$revocationsDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$revocationsDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0));
        this.ssoDao = new m(new DatabaseHelper$ssoDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$ssoDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0));
        this.childrenDao = new d(new DatabaseHelper$childrenDao$1(0, this, DatabaseHelper.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0), new DatabaseHelper$childrenDao$2(0, this, DatabaseHelper.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0));
    }

    private final void createDatabaseDirIfNeed() {
        File parentFile = this.context.getDatabasePath(DATABASE_NAME).getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public final long addOrUpdateAccountLastAction(com.yandex.passport.internal.sso.a accountAction) {
        m mVar = this.ssoDao;
        mVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "addOrUpdateAccountLastAction: uid=" + accountAction.d() + " timestamp=" + accountAction.c() + " lastAction=" + accountAction.a(), 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$ssoDao$2) mVar.b).invoke();
        ContentValues contentValues = new ContentValues();
        Uid d = accountAction.d();
        StringBuilder sb = new StringBuilder();
        sb.append(d.getEnvironment().getInteger());
        sb.append(':');
        sb.append(d.getValue());
        contentValues.put("uid", sb.toString());
        contentValues.put(ClidProvider.TIMESTAMP, Integer.valueOf(accountAction.c()));
        contentValues.put("last_action", accountAction.a().name());
        contentValues.put("local_timestamp", Long.valueOf(accountAction.b()));
        long T = a0.T(sQLiteDatabase, "accounts_last_action", contentValues);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "addOrUpdateAccountLastAction: uid=" + accountAction.d() + " rowid=" + T, 8);
        }
        return T;
    }

    public final long countClientTokens() {
        return DatabaseUtils.queryNumEntries((SQLiteDatabase) ((DatabaseHelper$tokensDao$1) this.tokensDao.a).invoke(), "tokens");
    }

    public final void deleteAccountRow(String name) {
        a aVar = this.accountsDao;
        int delete = ((SQLiteDatabase) ((DatabaseHelper$accountsDao$2) aVar.b).invoke()).delete("accounts", "name = ?", new String[]{name});
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, delete == 0 ? "deleteAccountRow: can't delete name=".concat(name) : "deleteAccountRow: deleted name=".concat(name), 8);
        }
        if (delete > 0) {
            aVar.j = null;
        }
    }

    public final void deleteAllChildren(String parentName) {
        ((SQLiteDatabase) ((DatabaseHelper$childrenDao$2) this.childrenDao.b).invoke()).delete("children", "parent_name  = ?", new String[]{parentName});
    }

    public final int deleteDelayedUid(Uid uid) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$delayedAccountUidsDao$2) this.delayedAccountUidsDao.b).invoke();
        sQLiteDatabase.beginTransaction();
        try {
            int delete = sQLiteDatabase.delete("local_uids", "uid = ?", new String[]{String.valueOf(uid.getValue())});
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void deleteRevocation(v revocation) {
        l lVar = this.revocationsDao;
        lVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "deleteRevocation: " + revocation, 8);
        }
        int delete = ((SQLiteDatabase) ((DatabaseHelper$revocationsDao$2) lVar.b).invoke()).delete("revocations", "uid = ? AND master_token_value = ?", a0.j0(revocation));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "deleteRevocation: delete rows " + delete, 8);
        }
    }

    public final void dropClientToken(String tokenValue) {
        n nVar = this.tokensDao;
        nVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "dropClientToken: tokenValue.length=" + tokenValue.length(), 8);
        }
        int delete = ((SQLiteDatabase) ((DatabaseHelper$tokensDao$2) nVar.b).invoke()).delete("tokens", "client_token = ?", new String[]{tokenValue});
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "dropClientToken(tokenValue): rows=" + delete, 8);
        }
    }

    public final ModernAccount findAccountByName(String name) {
        a aVar = this.accountsDao;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$accountsDao$1) aVar.a).invoke();
        StringBuilder sb = new StringBuilder("SELECT ");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb2.append(com.yandex.passport.internal.database.tables.a.b[i]);
            if (i != 9) {
                sb2.append(Extension.FIX_SPACE);
            }
        }
        sb.append(sb2.toString());
        sb.append(" FROM accounts WHERE name = ?");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), new String[]{name});
        try {
            Cursor cursor = rawQuery;
            if (!cursor.moveToFirst()) {
                ooc.g(rawQuery, null);
                return null;
            }
            ModernAccount b = aVar.g.b(aVar.a(cursor, name));
            ooc.g(rawQuery, null);
            return b;
        } finally {
        }
    }

    public final List<AccountRow> getAccountRows() {
        a aVar = this.accountsDao;
        if (!((Boolean) aVar.h.b(q.v0)).booleanValue()) {
            return aVar.b();
        }
        ArrayList arrayList = aVar.j;
        if (arrayList != null) {
            return arrayList;
        }
        synchronized (aVar.i) {
            ArrayList arrayList2 = aVar.j;
            if (arrayList2 != null) {
                return arrayList2;
            }
            ArrayList b = aVar.b();
            aVar.j = b;
            return b;
        }
    }

    public final List<com.yandex.passport.internal.sso.a> getAccountsLastActions() {
        m mVar = this.ssoDao;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$ssoDao$1) mVar.a).invoke()).query("accounts_last_action", com.yandex.passport.internal.database.tables.a.a, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                int i = com.yandex.passport.internal.sso.a.e;
                com.yandex.passport.internal.sso.a p = u.p(a0.L(cursor, "uid"), a0.L(cursor, "last_action"), a0.C(cursor, ClidProvider.TIMESTAMP), a0.D(cursor));
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getAccountsLastActions: select account row " + p, 8);
                }
                arrayList.add(p);
            }
            ooc.g(query, null);
            return kotlin.collections.a.M(arrayList);
        } finally {
        }
    }

    public final List<Uid> getAllDelayedUids() {
        f fVar = this.delayedAccountUidsDao;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$delayedAccountUidsDao$1) fVar.a).invoke()).query("local_uids", com.yandex.passport.internal.database.tables.a.c, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (true) {
                if (!cursor.moveToNext()) {
                    ooc.g(query, null);
                    return arrayList;
                }
                String L = a0.L(cursor, "uid");
                Long valueOf = L != null ? Long.valueOf(Long.parseLong(L)) : null;
                int C = a0.C(cursor, WebViewActivity.KEY_ENVIRONMENT);
                if (valueOf != null) {
                    Environment.Companion.getClass();
                    arrayList.add(a0.b(com.yandex.passport.common.core.a.a(C), valueOf.longValue()));
                }
            }
        } finally {
        }
    }

    public final List<c> getChildren(String parentName) {
        d dVar = this.childrenDao;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = ((SQLiteDatabase) ((DatabaseHelper$childrenDao$1) dVar.a).invoke()).rawQuery("SELECT * FROM children WHERE parent_name  = ? AND is_deleted = ?", new String[]{parentName, "0"});
        try {
            Cursor cursor = rawQuery;
            if (!cursor.moveToFirst()) {
                ooc.g(rawQuery, null);
                return arrayList;
            }
            while (!cursor.isAfterLast()) {
                arrayList.add(a0.O(cursor));
                cursor.moveToNext();
            }
            ooc.g(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final ClientToken getClientToken(Uid uid, String decryptedClientId) {
        return this.tokensDao.b(uid, decryptedClientId);
    }

    public final String getClientTokenValue(Uid uid) {
        n nVar = this.tokensDao;
        nVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getClientToken: uid=" + uid, 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$tokensDao$1) nVar.a).invoke();
        String[] strArr = com.yandex.passport.internal.database.tables.b.c;
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        Cursor query = sQLiteDatabase.query("tokens", strArr, "uid = ?", new String[]{sb.toString()}, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("client_token"));
                ooc.g(query, null);
                return string;
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getClientToken: no token for uid " + uid, 8);
            }
            ooc.g(query, null);
            return null;
        } finally {
        }
    }

    public final com.yandex.passport.internal.sso.a getLastAction(Uid uid) {
        com.yandex.passport.internal.sso.a aVar;
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$ssoDao$1) this.ssoDao.a).invoke()).query("accounts_last_action", com.yandex.passport.internal.database.tables.a.a, "uid = ?", a0.h0(uid), null, null, null);
        try {
            Cursor cursor = query;
            if (cursor.moveToNext()) {
                int i = com.yandex.passport.internal.sso.a.e;
                aVar = u.p(a0.L(cursor, "uid"), a0.L(cursor, "last_action"), a0.C(cursor, ClidProvider.TIMESTAMP), a0.D(cursor));
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getLastAction: select account row " + aVar, 8);
                }
            } else {
                aVar = null;
            }
            ooc.g(query, null);
            return aVar;
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase = super.getReadableDatabase();
        createDatabaseDirIfNeed();
        return readableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[Catch: all -> 0x00aa, TryCatch #2 {all -> 0x00aa, blocks: (B:3:0x0024, B:4:0x0027, B:6:0x002e, B:8:0x003e, B:11:0x0046, B:13:0x0050, B:17:0x005c, B:18:0x006c, B:21:0x0073, B:24:0x007c, B:26:0x0091, B:27:0x00ad, B:37:0x006a), top: B:2:0x0024, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<v> getRevocations() {
        Uid uid;
        String L;
        long parseLong;
        Environment environment;
        l lVar = this.revocationsDao;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$revocationsDao$1) lVar.a).invoke()).query("revocations", com.yandex.passport.internal.database.tables.b.b, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String M = a0.M(cursor, "uid");
                int D = evu0.D(M, ':', 0, false);
                if (D >= 1 && D != M.length() - 1) {
                    String substring = M.substring(0, D);
                    try {
                        parseLong = Long.parseLong(M.substring(D + 1));
                    } catch (NumberFormatException unused) {
                    }
                    if (parseLong > 0) {
                        try {
                            com.yandex.passport.common.core.a aVar = Environment.Companion;
                            int parseInt = Integer.parseInt(substring);
                            aVar.getClass();
                            environment = com.yandex.passport.common.core.a.a(parseInt);
                        } catch (Exception unused2) {
                            environment = Environment.PRODUCTION;
                        }
                        uid = a0.b(environment, parseLong);
                        if (uid != null && (L = a0.L(cursor, "master_token_value")) != null) {
                            v vVar = new v(a0.C(cursor, "attempts"), uid, L);
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getRevocations: select " + vVar, 8);
                            }
                            arrayList.add(vVar);
                        }
                    }
                }
                uid = null;
                if (uid != null) {
                    v vVar2 = new v(a0.C(cursor, "attempts"), uid, L);
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    }
                    arrayList.add(vVar2);
                }
            }
            ooc.g(query, null);
            return arrayList;
        } finally {
        }
    }

    public final n getTokensDao() {
        return this.tokensDao;
    }

    public final void increaseRevocationAttempts(v revocation) {
        l lVar = this.revocationsDao;
        lVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "increaseRevocationAttempts: " + revocation, 8);
        }
        ((SQLiteDatabase) ((DatabaseHelper$revocationsDao$2) lVar.b).invoke()).execSQL("UPDATE revocations SET attempts = attempts + 1 WHERE uid = ? AND master_token_value = ?", a0.j0(revocation));
    }

    public final void insertDelayedAccount(AccountRow account, Uid uid) {
        long R;
        a aVar = this.accountsDao;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$accountsDao$2) aVar.b).invoke();
        sQLiteDatabase.beginTransaction();
        try {
            R = a0.R(sQLiteDatabase, "accounts", aVar.c(account));
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", String.valueOf(uid.getValue()));
            contentValues.put(WebViewActivity.KEY_ENVIRONMENT, Integer.valueOf(uid.getEnvironment().getInteger()));
            a0.R(sQLiteDatabase, "local_uids", contentValues);
            if (R != -1) {
                aVar.j = null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void insertRevocation(v revocation) {
        long R;
        l lVar = this.revocationsDao;
        lVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "insertRevocation: " + revocation, 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$revocationsDao$2) lVar.b).invoke();
        ContentValues contentValues = new ContentValues();
        Uid b = revocation.b();
        StringBuilder sb = new StringBuilder();
        sb.append(b.getEnvironment().getInteger());
        sb.append(':');
        sb.append(b.getValue());
        contentValues.put("uid", sb.toString());
        contentValues.put("master_token_value", revocation.a());
        contentValues.put("attempts", (Integer) 0);
        R = a0.R(sQLiteDatabase, "revocations", contentValues);
        if (R == -1) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "insertRevocation: can't insert", 8);
            }
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "insertRevocation: done", 8);
        }
    }

    public final void mergeAccountRows(com.yandex.passport.internal.a accountsDifference) {
        String str;
        String str2;
        long R;
        String str3;
        a aVar = this.accountsDao;
        aVar.getClass();
        if (!accountsDifference.e()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "mergeAccountRows: no difference", 8);
                return;
            }
            return;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$accountsDao$2) aVar.b).invoke();
        Iterator it = ((ArrayList) accountsDifference.a()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            AccountRow accountRow = (AccountRow) it.next();
            R = a0.R(sQLiteDatabase, "accounts", aVar.c(accountRow));
            z = z || R != -1;
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel = LogLevel.DEBUG;
                if (R == -1) {
                    str3 = "mergeAccountRows: can't insert " + accountRow;
                } else {
                    str3 = "mergeAccountRows: inserted " + accountRow;
                }
                com.yandex.passport.common.logger.a.c(logLevel, null, str3, 8);
            }
            ModernAccount b = aVar.g.b(accountRow);
            if (b != null && b.getMasterToken().getValue() == null) {
                aVar.c.a(b.getUid());
            }
        }
        Iterator it2 = ((ArrayList) accountsDifference.d()).iterator();
        while (it2.hasNext()) {
            AccountRow accountRow2 = (AccountRow) it2.next();
            int update = sQLiteDatabase.update("accounts", aVar.c(accountRow2), "name = ?", a0.i0(accountRow2));
            z = z || update > 0;
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                if (update == 0) {
                    str2 = "mergeAccountRows: can't update " + accountRow2;
                } else {
                    str2 = "mergeAccountRows: updated " + accountRow2;
                }
                com.yandex.passport.common.logger.a.c(logLevel2, null, str2, 8);
            }
            ModernAccount b2 = aVar.g.b(accountRow2);
            if (b2 != null && b2.getMasterToken().getValue() == null) {
                aVar.c.a(b2.getUid());
            }
        }
        Iterator it3 = ((ArrayList) accountsDifference.b()).iterator();
        while (it3.hasNext()) {
            AccountRow accountRow3 = (AccountRow) it3.next();
            int delete = sQLiteDatabase.delete("accounts", "name = ?", a0.i0(accountRow3));
            z = z || delete > 0;
            com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel3 = LogLevel.DEBUG;
                if (delete == 0) {
                    str = "mergeAccountRows: can't delete " + accountRow3;
                } else {
                    str = "mergeAccountRows: deleted " + accountRow3;
                }
                com.yandex.passport.common.logger.a.c(logLevel3, null, str, 8);
            }
            ModernAccount b3 = aVar.g.b(accountRow3);
            if (b3 != null) {
                aVar.c.a(b3.getUid());
            }
        }
        Iterator it4 = ((ArrayList) accountsDifference.c()).iterator();
        while (it4.hasNext()) {
            AccountRow accountRow4 = (AccountRow) it4.next();
            com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "mergeAccountRows: skipped " + accountRow4, 8);
            }
        }
        if (z) {
            aVar.j = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase database) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCreate: database=" + database, 8);
        }
        database.execSQL("CREATE TABLE IF NOT EXISTS tokens (uid TEXT, client_id TEXT, client_token TEXT, PRIMARY KEY (uid,client_id))");
        database.execSQL("CREATE TABLE IF NOT EXISTS accounts (name TEXT, master_token_value TEXT, uid TEXT, user_info_body TEXT, user_info_meta TEXT, stash_body TEXT, legacy_account_type TEXT, legacy_affinity TEXT, legacy_extra_data_body TEXT, secure_blob TEXT, PRIMARY KEY (name))");
        database.execSQL("CREATE TABLE IF NOT EXISTS gcm_subscriptions (uid TEXT, gcm_token_hash TEXT, PRIMARY KEY (uid))");
        database.execSQL("CREATE TABLE IF NOT EXISTS accounts_last_action (uid TEXT, timestamp INTEGER, last_action TEXT, local_timestamp INTEGER, PRIMARY KEY (uid))");
        database.execSQL("CREATE TABLE IF NOT EXISTS children (uid TEXT, parent_name TEXT, is_child BOOLEAN, has_plus BOOLEAN, display_login TEXT, display_name TEXT, public_name TEXT, avatar_url TEXT, is_deleted BOOLEAN, PRIMARY KEY (uid), FOREIGN KEY (parent_name) REFERENCES accounts(name))");
        database.execSQL("CREATE TABLE IF NOT EXISTS local_uids (uid TEXT, environment INTEGER, PRIMARY KEY (uid))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onDowngrade: database=" + database + " oldVersion=" + oldVersion + " newVersion=" + newVersion, 8);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onUpgrade: database=" + database + " oldVersion=" + oldVersion + " newVersion=" + newVersion, 8);
        }
        if (oldVersion == 4) {
            oldVersion++;
            database.execSQL("CREATE TABLE IF NOT EXISTS gcm_subscriptions (uid TEXT, gcm_token_hash TEXT, PRIMARY KEY (uid))");
        }
        if (oldVersion == 5) {
            oldVersion++;
            database.execSQL("CREATE TABLE IF NOT EXISTS accounts_last_action (uid TEXT, timestamp INTEGER, last_action TEXT, local_timestamp INTEGER, PRIMARY KEY (uid))");
        }
        if (oldVersion == 6) {
            oldVersion++;
            database.execSQL("CREATE TABLE IF NOT EXISTS children (uid TEXT, parent_name TEXT, is_child BOOLEAN, has_plus BOOLEAN, display_login TEXT, display_name TEXT, public_name TEXT, avatar_url TEXT, is_deleted BOOLEAN, PRIMARY KEY (uid), FOREIGN KEY (parent_name) REFERENCES accounts(name))");
        }
        if (oldVersion == 7) {
            oldVersion++;
            com.yandex.passport.internal.database.tables.b.b(database);
        }
        if (oldVersion == 8) {
            oldVersion++;
        }
        if (oldVersion == 9) {
            oldVersion++;
            com.yandex.passport.internal.database.tables.b.a(database);
        }
        if (oldVersion == 10) {
            oldVersion++;
            database.execSQL(SQL_DELETE_EXTRA_UIDS_FOR_SUBSCRIPTION_TABLE);
        }
        if (oldVersion == 11) {
            oldVersion++;
            database.execSQL("CREATE TABLE IF NOT EXISTS local_uids (uid TEXT, environment INTEGER, PRIMARY KEY (uid))");
        }
        if (oldVersion == 12) {
            oldVersion++;
            try {
                database.execSQL("ALTER TABLE accounts ADD COLUMN secure_blob TEXT");
            } catch (SQLiteException e) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "", e);
                }
            }
        }
        if (newVersion == oldVersion) {
            return;
        }
        ny61.r("Database migration failed");
    }

    public final long putClientToken(Uid uid, ClientToken clientToken) {
        n nVar = this.tokensDao;
        nVar.getClass();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "putClientToken: uid=" + uid + " clientId=" + clientToken.getDecryptedClientId() + " token.length=" + clientToken.getValue().length(), 8);
        }
        ContentValues contentValues = new ContentValues();
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        contentValues.put("uid", sb.toString());
        contentValues.put("client_id", clientToken.getDecryptedClientId());
        contentValues.put("client_token", clientToken.getValue());
        long T = a0.T((SQLiteDatabase) ((DatabaseHelper$tokensDao$2) nVar.b).invoke(), "tokens", contentValues);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "putClientToken: uid=" + uid + " rowid=" + T, 8);
        }
        return T;
    }

    public final void updateChildren(String parentName, List<GetChildrenInfoRequest$Member> children) {
        DatabaseHelper$childrenDao$2 databaseHelper$childrenDao$2 = (DatabaseHelper$childrenDao$2) this.childrenDao.b;
        ((SQLiteDatabase) databaseHelper$childrenDao$2.invoke()).delete("children", "parent_name  = ? AND is_deleted = ?", new String[]{parentName, "0"});
        List<GetChildrenInfoRequest$Member> list = children;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a0.P(parentName, (GetChildrenInfoRequest$Member) it.next()));
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) databaseHelper$childrenDao$2.invoke();
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a0.R(sQLiteDatabase, "children", ((c) it2.next()).a());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:3:0x0013, B:5:0x0019, B:7:0x0022, B:10:0x002a, B:12:0x0033, B:16:0x003e, B:17:0x004e, B:19:0x0056, B:21:0x0061, B:23:0x0073, B:24:0x0075, B:26:0x007f, B:28:0x0083, B:29:0x00a7, B:30:0x0090, B:31:0x00ac, B:37:0x004c), top: B:2:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:3:0x0013, B:5:0x0019, B:7:0x0022, B:10:0x002a, B:12:0x0033, B:16:0x003e, B:17:0x004e, B:19:0x0056, B:21:0x0061, B:23:0x0073, B:24:0x0075, B:26:0x007f, B:28:0x0083, B:29:0x00a7, B:30:0x0090, B:31:0x00ac, B:37:0x004c), top: B:2:0x0013, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateDelayedAccount(AccountRow newAccountRow) {
        Uid uid;
        String str;
        int D;
        long parseLong;
        Environment environment;
        a aVar = this.accountsDao;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$accountsDao$2) aVar.b).invoke();
        sQLiteDatabase.beginTransaction();
        try {
            String str2 = newAccountRow.uidString;
            if (str2 != null && (D = evu0.D(str2, ':', 0, false)) >= 1 && D != str2.length() - 1) {
                String substring = str2.substring(0, D);
                try {
                    parseLong = Long.parseLong(str2.substring(D + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar2 = Environment.Companion;
                        int parseInt = Integer.parseInt(substring);
                        aVar2.getClass();
                        environment = com.yandex.passport.common.core.a.a(parseInt);
                    } catch (Exception unused2) {
                        environment = Environment.PRODUCTION;
                    }
                    uid = a0.b(environment, parseLong);
                    if (uid != null ? aVar.d.a(uid) : false) {
                        int update = sQLiteDatabase.update("accounts", aVar.c(newAccountRow), "name = ?", a0.i0(newAccountRow));
                        if (update > 0) {
                            aVar.j = null;
                        }
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            LogLevel logLevel = LogLevel.DEBUG;
                            if (update == 0) {
                                str = "updateLocalAccount: can't update " + newAccountRow;
                            } else {
                                str = "updateLocalAccount: updated rowId " + update + HexString.CHAR_SPACE + newAccountRow + HexString.CHAR_SPACE;
                            }
                            com.yandex.passport.common.logger.a.c(logLevel, null, str, 8);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                }
            }
            uid = null;
            if (uid != null ? aVar.d.a(uid) : false) {
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void dropClientToken(Uid uid) {
        this.tokensDao.a(uid);
    }

    public /* synthetic */ DatabaseHelper(String str, int i, Context context, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.j jVar, com.yandex.passport.internal.network.mappers.h hVar, com.yandex.passport.internal.flags.j jVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 13 : i, context, kVar, jVar, hVar, jVar2);
    }

    public DatabaseHelper(Context context, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.j jVar, com.yandex.passport.internal.network.mappers.h hVar, com.yandex.passport.internal.flags.j jVar2) {
        this(DATABASE_NAME, 0, context, kVar, jVar, hVar, jVar2, 2, null);
    }
}
