package com.yandex.div.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.DivStorageImpl.CursorDrivenRawDataAndMetadata;
import com.yandex.div.storage.DivStorageImpl.CursorDrivenRawJson;
import com.yandex.div.storage.c;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.database.c;
import defpackage.c9i0;
import defpackage.cai0;
import defpackage.cms;
import defpackage.g8e;
import defpackage.g9i0;
import defpackage.gju0;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jms;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.pbl;
import defpackage.q5z;
import defpackage.qbl;
import defpackage.sey0;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xko;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 \u001f2\u00020\u0001:\u0005/\u0081\u0001\u0082\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0015\u0010\u000eJ;\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b#\u0010$J1\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0017¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0+H\u0017¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b2\u00103J#\u00106\u001a\b\u0012\u0004\u0012\u00020!0'2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0017¢\u0006\u0004\b6\u00107J#\u00108\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,0+H\u0017¢\u0006\u0004\b8\u00100J#\u0010;\u001a\b\u0012\u0004\u0012\u00020:0'2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0017¢\u0006\u0004\b;\u00107J\u0011\u0010<\u001a\u0004\u0018\u000101H\u0017¢\u0006\u0004\b<\u00103J\u001f\u0010>\u001a\u00020,2\u0006\u0010=\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020,2\u0006\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0'H\u0016¢\u0006\u0004\bD\u0010EJ#\u0010J\u001a\u0004\u0018\u00010(*\u00020F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0012¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\b\u0012\u0004\u0012\u00020:0\u0017*\u00020FH\u0012¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\b\u0012\u0004\u0012\u00020\u0006042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0+H\u0013¢\u0006\u0004\bN\u0010OJ#\u0010P\u001a\b\u0012\u0004\u0012\u00020!0\u00172\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0013¢\u0006\u0004\bP\u0010QJ)\u0010R\u001a\b\u0012\u0004\u0012\u00020\u0006042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,0+H\u0013¢\u0006\u0004\bR\u0010OJ-\u0010V\u001a\u0004\u0018\u0001012\u0006\u0010S\u001a\u00020\u00062\u0012\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060T\"\u00020\u0006H\u0013¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\b\u0012\u0004\u0012\u00020C0\u0017*\u00020FH\u0012¢\u0006\u0004\bX\u0010MJ+\u0010\\\u001a\u000201*\u00060Yj\u0002`Z2\u0006\u0010S\u001a\u00020\u00062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0006H\u0012¢\u0006\u0004\b\\\u0010]J#\u0010`\u001a\u00020_2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020F0+H\u0013¢\u0006\u0004\b`\u0010aJ\u001b\u0010c\u001a\u00020\u000f*\u00020F2\u0006\u0010b\u001a\u00020\u0006H\u0012¢\u0006\u0004\bc\u0010dJ\u0013\u0010g\u001a\u00020f*\u00020eH\u0012¢\u0006\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u0010iR\u0014\u0010m\u001a\u00020k8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b<\u0010lR \u0010t\u001a\u00020n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b6\u0010o\u0012\u0004\br\u0010s\u001a\u0004\bp\u0010qR\u0014\u0010w\u001a\u00020u8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b)\u0010vR2\u0010~\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0y\u0012\u0004\u0012\u00020z0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010{\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020z8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b2\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl;", "Lcom/yandex/div/storage/c;", "Landroid/content/Context;", "context", "Lcom/yandex/div/storage/database/d;", "openHelperProvider", "", "databaseNamePrefix", "<init>", "(Landroid/content/Context;Lcom/yandex/div/storage/database/d;Ljava/lang/String;)V", "Lcom/yandex/div/storage/database/c$b;", "db", "Lzy11;", "F", "(Lcom/yandex/div/storage/database/c$b;)V", "", "oldVersion", "newVersion", "G", "(Lcom/yandex/div/storage/database/c$b;II)V", "u", RemoteBioParameters.X, "groupId", "", "Lc9i0;", "divs", "Lsey0;", "templatesByHash", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lxko;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "Lg9i0;", "rawJsons", "m", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "ids", "idsToExclude", "Lcom/yandex/div/storage/c$a;", "Lcom/yandex/div/storage/c$c;", "d", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/c$a;", "Lkotlin/Function1;", "", "predicate", "Lcom/yandex/div/storage/c$b;", "a", "(Ltls;)Lcom/yandex/div/storage/c$b;", "Lcom/yandex/div/storage/DivStorageErrorException;", "f", "()Lcom/yandex/div/storage/DivStorageErrorException;", "", "rawJsonIds", "c", "(Ljava/util/Set;)Lcom/yandex/div/storage/c$a;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "templateHashes", "Lcai0;", "l", "b", "id", "k", "(Ljava/lang/String;Ljava/lang/String;)Z", "templateHash", "h", "(Ljava/lang/String;)Z", "Lcom/yandex/div/storage/c$d;", "e", "()Lcom/yandex/div/storage/c$a;", "Landroid/database/Cursor;", "", "Lcom/yandex/div/storage/database/StorageException;", "exceptions", RemoteBioParameters.Y, "(Landroid/database/Cursor;Ljava/util/List;)Lcom/yandex/div/storage/c$c;", CA20Status.STATUS_REQUEST_C, "(Landroid/database/Cursor;)Ljava/util/List;", "t", "(Ltls;)Ljava/util/Set;", "r", "(Ljava/util/Set;)Ljava/util/List;", "s", "actionDesc", "", "queries", "w", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageErrorException;", "B", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cardId", CA20Status.STATUS_REQUEST_K, "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageErrorException;", "func", "Lcom/yandex/div/storage/database/ReadState;", CA20Status.STATUS_CERTIFICATE_H, "(Ltls;)Lcom/yandex/div/storage/database/ReadState;", "columnName", CA20Status.STATUS_REQUEST_D, "(Landroid/database/Cursor;Ljava/lang/String;)I", "", "Lorg/json/JSONObject;", "J", "([B)Lorg/json/JSONObject;", "Ljava/lang/String;", "dbName", "Lcom/yandex/div/storage/database/c;", "Lcom/yandex/div/storage/database/c;", "openHelper", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "z", "()Lcom/yandex/div/storage/database/StorageStatementExecutor;", "A", "()V", "statementExecutor", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "dataSaveUseCase", "", "Lkotlin/Pair;", "Lcom/yandex/div/storage/database/e;", "Ljava/util/Map;", CoreConstants.PushMessage.SERVICE_TYPE, "()Ljava/util/Map;", "migrations", "Lcom/yandex/div/storage/database/e;", "defaultDropAllMigration", "CursorDrivenRawDataAndMetadata", "CursorDrivenRawJson", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DivStorageImpl implements com.yandex.div.storage.c {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: from kotlin metadata */
    private final String dbName;

    /* renamed from: b, reason: from kotlin metadata */
    private final com.yandex.div.storage.database.c openHelper;

    /* renamed from: c, reason: from kotlin metadata */
    private final StorageStatementExecutor statementExecutor;

    /* renamed from: d, reason: from kotlin metadata */
    private final SingleTransactionDataSavePerformer dataSaveUseCase;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map<Pair<Integer, Integer>, com.yandex.div.storage.database.e> migrations;

    /* renamed from: f, reason: from kotlin metadata */
    private final com.yandex.div.storage.database.e defaultDropAllMigration;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$CursorDrivenRawDataAndMetadata;", "Lc9i0;", "Ljava/io/Closeable;", "Landroid/database/Cursor;", "cursor", "<init>", "(Lcom/yandex/div/storage/DivStorageImpl;Landroid/database/Cursor;)V", "Lzy11;", "close", "()V", "a", "Landroid/database/Cursor;", "d", "()Landroid/database/Cursor;", "", "b", "Z", "cursorInvalid", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lorg/json/JSONObject;", "w", "Li3y;", "()Lorg/json/JSONObject;", "divData", RemoteBioParameters.X, "getMetadata", kju0.j, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CursorDrivenRawDataAndMetadata implements c9i0, Closeable {

        /* renamed from: a, reason: from kotlin metadata */
        private final Cursor cursor;

        /* renamed from: b, reason: from kotlin metadata */
        private boolean cursorInvalid;

        /* renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* renamed from: w, reason: from kotlin metadata */
        private final i3y divData;

        /* renamed from: x, reason: from kotlin metadata */
        private final i3y metadata;

        public CursorDrivenRawDataAndMetadata(Cursor cursor) {
            this.cursor = cursor;
            this.id = cursor.getString(DivStorageImpl.this.D(cursor, kju0.f));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.divData = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawDataAndMetadata$divData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final JSONObject invoke() {
                    boolean z;
                    JSONObject J;
                    z = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.cursorInvalid;
                    if (z) {
                        ny61.r("Data no longer valid!");
                        return null;
                    }
                    J = r2.J(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor().getBlob(r2.D(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor(), kju0.g)));
                    return J;
                }
            });
            this.metadata = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawDataAndMetadata$metadata$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final JSONObject invoke() {
                    boolean z;
                    JSONObject J;
                    z = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.cursorInvalid;
                    if (z) {
                        ny61.r("Data no longer valid!");
                        return null;
                    }
                    Cursor cursor2 = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor();
                    int D = r2.D(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor(), kju0.j);
                    byte[] blob = cursor2.isNull(D) ? null : cursor2.getBlob(D);
                    if (blob == null) {
                        return null;
                    }
                    J = r2.J(blob);
                    return J;
                }
            });
        }

        @Override // defpackage.c9i0
        /* renamed from: c */
        public final JSONObject getDivData() {
            return (JSONObject) this.divData.getValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.cursorInvalid = true;
        }

        /* renamed from: d, reason: from getter */
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // defpackage.c9i0
        public final String getId() {
            return this.id;
        }

        @Override // defpackage.c9i0
        /* renamed from: getMetadata */
        public final JSONObject getKju0.j java.lang.String() {
            return (JSONObject) this.metadata.getValue();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$CursorDrivenRawJson;", "Lg9i0;", "Ljava/io/Closeable;", "Landroid/database/Cursor;", "cursor", "<init>", "(Lcom/yandex/div/storage/DivStorageImpl;Landroid/database/Cursor;)V", "Lzy11;", "close", "()V", "a", "Landroid/database/Cursor;", "c", "()Landroid/database/Cursor;", "", "b", "Z", "cursorInvalid", "", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lorg/json/JSONObject;", "w", "Li3y;", "getData", "()Lorg/json/JSONObject;", Constants.KEY_DATA, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CursorDrivenRawJson implements g9i0, Closeable {

        /* renamed from: a, reason: from kotlin metadata */
        private final Cursor cursor;

        /* renamed from: b, reason: from kotlin metadata */
        private boolean cursorInvalid;

        /* renamed from: c, reason: from kotlin metadata */
        private final String id;

        /* renamed from: w, reason: from kotlin metadata */
        private final i3y data;

        public CursorDrivenRawJson(Cursor cursor) {
            this.cursor = cursor;
            this.id = cursor.getString(DivStorageImpl.this.D(cursor, kju0.o));
            this.data = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawJson$data$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final JSONObject invoke() {
                    boolean z;
                    JSONObject J;
                    z = DivStorageImpl.CursorDrivenRawJson.this.cursorInvalid;
                    if (z) {
                        ny61.r("Data no longer valid!");
                        return null;
                    }
                    J = r2.J(DivStorageImpl.CursorDrivenRawJson.this.getCursor().getBlob(r2.D(DivStorageImpl.CursorDrivenRawJson.this.getCursor(), kju0.p)));
                    return J;
                }
            });
        }

        /* renamed from: c, reason: from getter */
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.cursorInvalid = true;
        }

        @Override // defpackage.g9i0
        public final JSONObject getData() {
            return (JSONObject) this.data.getValue();
        }

        @Override // defpackage.g9i0
        public final String getId() {
            return this.id;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final /* synthetic */ class b implements c.a, jms {
        public b() {
        }

        @Override // com.yandex.div.storage.database.c.a
        public final void a(c.b bVar) {
            DivStorageImpl.this.u(bVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c.a) && (obj instanceof jms)) {
                return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.jms
        public final cms getFunctionDelegate() {
            return new FunctionReferenceImpl(1, DivStorageImpl.this, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final /* synthetic */ class c implements c.InterfaceC0036c, jms {
        public c() {
        }

        @Override // com.yandex.div.storage.database.c.InterfaceC0036c
        public final void a(c.b bVar, int i, int i2) {
            DivStorageImpl.this.G(bVar, i, i2);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c.InterfaceC0036c) && (obj instanceof jms)) {
                return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.jms
        public final cms getFunctionDelegate() {
            return new FunctionReferenceImpl(3, DivStorageImpl.this, DivStorageImpl.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public DivStorageImpl(Context context, com.yandex.div.storage.database.d dVar, String str) {
        String concat = str.length() == 0 ? "div-storage.db" : str.concat("-div-storage.db");
        this.dbName = concat;
        this.openHelper = dVar.a(context, concat, 3, new b(), new c());
        StorageStatementExecutor storageStatementExecutor = new StorageStatementExecutor(new sls() { // from class: com.yandex.div.storage.DivStorageImpl$statementExecutor$1
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c.b invoke() {
                com.yandex.div.storage.database.c cVar;
                cVar = DivStorageImpl.this.openHelper;
                return cVar.getWritableDatabase();
            }
        });
        this.statementExecutor = storageStatementExecutor;
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(storageStatementExecutor);
        this.migrations = gw00.e(new Pair(new Pair(2, 3), new qbl()));
        this.defaultDropAllMigration = new com.yandex.div.storage.database.e() { // from class: rbl
            @Override // com.yandex.div.storage.database.e
            public final void a(c.b bVar) {
                DivStorageImpl divStorageImpl = DivStorageImpl.this;
                divStorageImpl.x(bVar);
                divStorageImpl.u(bVar);
            }
        };
    }

    public static /* synthetic */ void A() {
    }

    private List<c.d> B(Cursor cursor) throws SQLException {
        if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new c.d(cursor.getString(D(cursor, "group_id")), cursor.getString(D(cursor, "template_id")), cursor.getString(D(cursor, kju0.m))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    private List<cai0> C(Cursor cursor) throws SQLException {
        if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new cai0(cursor.getString(D(cursor, kju0.m)), cursor.getBlob(D(cursor, "template_data"))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        ny61.r(oyr.p("Column '", str, "' not found in cursor"));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(c.b bVar) {
        try {
            bVar.r(kju0.t);
        } catch (SQLException e) {
            throw new SQLException("Create \"raw_json\" table", e);
        }
    }

    private ReadState H(tls func) {
        final c.b readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new sls() { // from class: com.yandex.div.storage.DivStorageImpl$readStateFor$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final /* bridge */ /* synthetic */ Object invoke() {
                m141invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m141invoke() {
                try {
                    c.b.this.close();
                } catch (IOException unused) {
                }
            }
        }, new pbl(0, readableDatabase, func));
    }

    private static final Cursor I(c.b bVar, tls tlsVar) {
        return (Cursor) tlsVar.invoke(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject J(byte[] bArr) {
        return new JSONObject(new String(bArr, StandardCharsets.UTF_8));
    }

    private DivStorageErrorException K(Exception exc, String str, String str2) {
        return new DivStorageErrorException(g8e.o("Unexpected exception on database access: ", str), exc, str2);
    }

    public static /* synthetic */ DivStorageErrorException L(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: toStorageException");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.K(exc, str, str2);
    }

    private List<g9i0> r(final Set<String> rawJsonIds) throws SQLException {
        ArrayList arrayList = new ArrayList(rawJsonIds.size());
        ReadState H = H(new tls() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Cursor invoke(c.b bVar) {
                return bVar.S1("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n ".concat(DivStorageImpl.INSTANCE.b(rawJsonIds)), new String[0]);
            }
        });
        try {
            Cursor a = H.a();
            if (a.getCount() != 0 && a.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(a);
                    arrayList.add(new g9i0.b(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (a.moveToNext());
            }
            H.close();
            return arrayList;
        } finally {
        }
    }

    private Set<String> s(final tls predicate) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        StorageStatements storageStatements = StorageStatements.a;
        tls tlsVar = new tls() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsonsIdsFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ReadState readState) {
                Cursor a = readState.a();
                if (a.getCount() == 0 || !a.moveToFirst()) {
                    return;
                }
                do {
                    DivStorageImpl.CursorDrivenRawJson cursorDrivenRawJson = DivStorageImpl.this.new CursorDrivenRawJson(a);
                    if (((Boolean) predicate.invoke(cursorDrivenRawJson)).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawJson.getId());
                    }
                    cursorDrivenRawJson.close();
                } while (a.moveToNext());
            }

            @Override // defpackage.tls
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ReadState) obj);
                return zy11.a;
            }
        };
        storageStatements.getClass();
        storageStatementExecutor.c(new StorageStatements.h(tlsVar));
        return linkedHashSet;
    }

    private Set<String> t(final tls predicate) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        StorageStatements storageStatements = StorageStatements.a;
        tls tlsVar = new tls() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRecordsFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ReadState readState) {
                Cursor a = readState.a();
                if (a.getCount() == 0 || !a.moveToFirst()) {
                    return;
                }
                do {
                    DivStorageImpl.CursorDrivenRawDataAndMetadata cursorDrivenRawDataAndMetadata = DivStorageImpl.this.new CursorDrivenRawDataAndMetadata(a);
                    if (((Boolean) predicate.invoke(cursorDrivenRawDataAndMetadata)).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawDataAndMetadata.getId());
                    }
                    cursorDrivenRawDataAndMetadata.close();
                } while (a.moveToNext());
            }

            @Override // defpackage.tls
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ReadState) obj);
                return zy11.a;
            }
        };
        storageStatements.getClass();
        storageStatementExecutor.c(new StorageStatements.g(tlsVar));
        return linkedHashSet;
    }

    private static final void v(DivStorageImpl divStorageImpl, c.b bVar) {
        divStorageImpl.x(bVar);
        divStorageImpl.u(bVar);
    }

    private DivStorageErrorException w(String actionDesc, String... queries) {
        c.b writableDatabase = this.openHelper.getWritableDatabase();
        ArrayList arrayList = new ArrayList(queries.length);
        for (String str : queries) {
            arrayList.add(writableDatabase.g(str));
        }
        try {
            try {
                writableDatabase.i();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SQLiteStatement) it.next()).executeUpdateDelete();
                }
                writableDatabase.s();
                try {
                    writableDatabase.t();
                } catch (IllegalStateException unused) {
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((SQLiteStatement) it2.next()).close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    writableDatabase.close();
                } catch (IOException unused3) {
                }
                return null;
            } catch (SQLException e) {
                DivStorageErrorException L = L(this, e, actionDesc, null, 2, null);
                try {
                    writableDatabase.t();
                } catch (IllegalStateException unused4) {
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    try {
                        ((SQLiteStatement) it3.next()).close();
                    } catch (IOException unused5) {
                    }
                }
                try {
                    writableDatabase.close();
                    return L;
                } catch (IOException unused6) {
                    return L;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c.C0035c y(Cursor cursor, List<StorageException> list) {
        JSONObject jSONObject;
        JSONObject J;
        String string = cursor.getString(D(cursor, kju0.f));
        String string2 = cursor.getString(D(cursor, "group_id"));
        int D = D(cursor, kju0.g);
        byte[] blob = cursor.isNull(D) ? null : cursor.getBlob(D);
        int D2 = D(cursor, kju0.j);
        byte[] blob2 = cursor.isNull(D2) ? null : cursor.getBlob(D2);
        if (blob == null) {
            list.add(new DivStorageErrorException(unr0.l('.', "DivData is null for card with id ", string), null, string, 2, null));
            return null;
        }
        try {
            jSONObject = J(blob);
        } catch (JSONException e) {
            list.add(new DivStorageErrorException(g8e.o("DivData is invalid for card with id ", string), e, string));
            jSONObject = null;
        }
        if (blob2 != null) {
            try {
                J = J(blob2);
            } catch (JSONException e2) {
                list.add(new DivStorageErrorException(g8e.o("Metadata is invalid for card with id ", string), e2, string));
            }
            if (jSONObject != null) {
                return null;
            }
            return new c.C0035c(string, jSONObject, J, string2);
        }
        J = null;
        if (jSONObject != null) {
        }
    }

    public final void F(c.b db) {
        u(db);
    }

    public final void G(c.b db, int oldVersion, int newVersion) {
        q5z.d(null, Long.valueOf(newVersion), 3L);
        if (oldVersion == 3) {
            return;
        }
        com.yandex.div.storage.database.e eVar = this.migrations.get(new Pair(Integer.valueOf(oldVersion), Integer.valueOf(newVersion)));
        if (eVar == null) {
            eVar = this.defaultDropAllMigration;
        }
        try {
            eVar.a(db);
        } catch (SQLException unused) {
            this.defaultDropAllMigration.a(db);
        }
    }

    @Override // com.yandex.div.storage.c
    public final c.b a(tls predicate) throws SQLException {
        Set<String> t = t(predicate);
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        DivDataRepository.ActionOnError actionOnError = DivDataRepository.ActionOnError.SKIP_ELEMENT;
        StorageStatements storageStatements = StorageStatements.a;
        storageStatements.getClass();
        StorageStatements.a aVar = new StorageStatements.a(t);
        storageStatements.getClass();
        return new c.b(t, storageStatementExecutor.b(actionOnError, aVar, new StorageStatements.c()).a());
    }

    @Override // com.yandex.div.storage.c
    public final DivStorageErrorException b() {
        return w("Delete all templates", gju0.j, "DELETE FROM templates");
    }

    @Override // com.yandex.div.storage.c
    public final c.a<g9i0> c(Set<String> rawJsonIds) {
        List<g9i0> list;
        String str = "Read raw jsons with ids: " + rawJsonIds;
        ArrayList arrayList = new ArrayList();
        try {
            list = r(rawJsonIds);
        } catch (SQLException e) {
            arrayList.add(L(this, e, str, null, 2, null));
            list = EmptyList.a;
            return new c.a<>(list, arrayList);
        } catch (IllegalStateException e2) {
            arrayList.add(L(this, e2, str, null, 2, null));
            list = EmptyList.a;
            return new c.a<>(list, arrayList);
        }
        return new c.a<>(list, arrayList);
    }

    @Override // com.yandex.div.storage.c
    public final c.a<c.C0035c> d(List<String> ids, List<String> idsToExclude) {
        final String sb;
        DivStorageImpl divStorageImpl;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        ReadState H;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(ids.size());
        ArrayList arrayList2 = new ArrayList();
        if (ids.isEmpty() && idsToExclude.isEmpty()) {
            sb = null;
        } else if (ids.isEmpty()) {
            sb = "layout_id NOT IN ".concat(INSTANCE.b(idsToExclude));
        } else if (idsToExclude.isEmpty()) {
            sb = "layout_id IN ".concat(INSTANCE.b(ids));
        } else {
            StringBuilder sb2 = new StringBuilder("layout_id NOT IN ");
            Companion companion = INSTANCE;
            sb2.append(companion.b(idsToExclude));
            sb2.append(" AND layout_id IN ");
            sb2.append(companion.b(ids));
            sb = sb2.toString();
        }
        try {
            try {
            } catch (SQLiteDatabaseLockedException e) {
                divStorageImpl = this;
                sQLiteDatabaseLockedException = e;
            }
            try {
                H = H(new tls() { // from class: com.yandex.div.storage.DivStorageImpl$loadData$cardsReadState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Cursor invoke(c.b bVar) {
                        return bVar.m1(kju0.b, null, sb, null, null, null, null, null);
                    }
                });
            } catch (SQLiteDatabaseLockedException e2) {
                sQLiteDatabaseLockedException = e2;
                divStorageImpl = this;
                arrayList2.add(L(divStorageImpl, sQLiteDatabaseLockedException, "Exception on load data from storage", null, 2, null));
                return new c.a<>(arrayList, arrayList2);
            }
        } catch (IllegalStateException e3) {
            arrayList2.add(L(this, e3, "Exception on load data from storage", null, 2, null));
        }
        try {
            Cursor a = H.a();
            if (a.getCount() != 0 && a.moveToFirst()) {
                do {
                    c.C0035c y = y(a, arrayList2);
                    if (y != null) {
                        arrayList.add(y);
                        linkedHashSet.add(y.h());
                    }
                } while (a.moveToNext());
                H.close();
                return new c.a<>(arrayList, arrayList2);
            }
            c.a<c.C0035c> aVar = new c.a<>(EmptyList.a, arrayList2);
            H.close();
            return aVar;
        } finally {
        }
    }

    @Override // com.yandex.div.storage.c
    public final c.a<c.d> e() {
        EmptyList emptyList = EmptyList.a;
        try {
            ReadState H = H(DivStorageImpl$readTemplateReferences$readState$1.w);
            try {
                List<c.d> B = B(H.a());
                H.close();
                return new c.a<>(B, null, 2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(H, th);
                    throw th2;
                }
            }
        } catch (SQLException e) {
            return new c.a<>(emptyList, Collections.singletonList(L(this, e, "Template references", null, 2, null)));
        } catch (IllegalStateException e2) {
            return new c.a<>(emptyList, Collections.singletonList(L(this, e2, "Template references", null, 2, null)));
        }
    }

    @Override // com.yandex.div.storage.c
    public final DivStorageErrorException f() {
        return w("delete all cards", gju0.b);
    }

    @Override // com.yandex.div.storage.c
    public final xko g(String groupId, List<? extends c9i0> divs, List<sey0> templatesByHash, DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.g(groupId, divs, templatesByHash, actionOnError);
    }

    @Override // com.yandex.div.storage.c
    public final boolean h(String templateHash) throws DivStorageErrorException {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        StorageStatements storageStatements = StorageStatements.a;
        tls tlsVar = new tls() { // from class: com.yandex.div.storage.DivStorageImpl$isTemplateExists$executionResult$1
            {
                super(1);
            }

            public final void b(boolean z) {
                Ref$BooleanRef.this.element = z;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Ref$BooleanRef.this.element = ((Boolean) obj).booleanValue();
                return zy11.a;
            }
        };
        storageStatements.getClass();
        xko c2 = storageStatementExecutor.c(new StorageStatements.f(templateHash, tlsVar));
        if (c2.b() || c2.a().isEmpty()) {
            return ref$BooleanRef.element;
        }
        throw L(this, (Exception) kotlin.collections.a.P(c2.a()), oyr.p("Check template ", templateHash, " exists"), null, 2, null);
    }

    @Override // com.yandex.div.storage.c
    public final Map<Pair<Integer, Integer>, com.yandex.div.storage.database.e> i() {
        return this.migrations;
    }

    @Override // com.yandex.div.storage.c
    public final c.b j(tls predicate) {
        Set<String> s = s(predicate);
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        DivDataRepository.ActionOnError actionOnError = DivDataRepository.ActionOnError.SKIP_ELEMENT;
        StorageStatements.a.getClass();
        return new c.b(s, storageStatementExecutor.b(actionOnError, new StorageStatements.b(s)).a());
    }

    @Override // com.yandex.div.storage.c
    public final boolean k(String id, String groupId) throws DivStorageErrorException {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        StorageStatementExecutor storageStatementExecutor = this.statementExecutor;
        StorageStatements storageStatements = StorageStatements.a;
        tls tlsVar = new tls() { // from class: com.yandex.div.storage.DivStorageImpl$isCardExists$executionResult$1
            {
                super(1);
            }

            public final void b(boolean z) {
                Ref$BooleanRef.this.element = z;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Ref$BooleanRef.this.element = ((Boolean) obj).booleanValue();
                return zy11.a;
            }
        };
        storageStatements.getClass();
        xko c2 = storageStatementExecutor.c(new StorageStatements.e(id, groupId, tlsVar));
        if (c2.b() || c2.a().isEmpty()) {
            return ref$BooleanRef.element;
        }
        throw K((Exception) kotlin.collections.a.P(c2.a()), "Check card exists", id);
    }

    @Override // com.yandex.div.storage.c
    public final c.a<cai0> l(final Set<String> templateHashes) {
        DivStorageImpl divStorageImpl;
        SQLException sQLException;
        List<cai0> list;
        String str = "Read templates with hashes: " + templateHashes;
        ArrayList arrayList = new ArrayList();
        try {
            try {
            } catch (SQLException e) {
                divStorageImpl = this;
                sQLException = e;
            }
            try {
                ReadState H = H(new tls() { // from class: com.yandex.div.storage.DivStorageImpl$readTemplates$readState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Cursor invoke(c.b bVar) {
                        return bVar.S1("\n    SELECT t.template_hash, t.template_data\n    FROM templates AS t\n    WHERE t.template_hash in\n  ".concat(DivStorageImpl.INSTANCE.b(templateHashes)), new String[0]);
                    }
                });
                try {
                    list = C(H.a());
                    H.close();
                } finally {
                }
            } catch (SQLException e2) {
                sQLException = e2;
                divStorageImpl = this;
                arrayList.add(L(divStorageImpl, sQLException, str, null, 2, null));
                list = EmptyList.a;
                return new c.a<>(list, arrayList);
            }
        } catch (IllegalStateException e3) {
            arrayList.add(L(this, e3, str, null, 2, null));
            list = EmptyList.a;
            return new c.a<>(list, arrayList);
        }
        return new c.a<>(list, arrayList);
    }

    @Override // com.yandex.div.storage.c
    public final xko m(List<? extends g9i0> rawJsons, DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.h(rawJsons, actionOnError);
    }

    public final void u(c.b db) throws SQLException {
        try {
            db.r(kju0.q);
            db.r(kju0.s);
            db.r(kju0.r);
            db.r(kju0.t);
        } catch (SQLException e) {
            throw new SQLException("Create tables", e);
        }
    }

    public final void x(final c.b db) throws SQLException {
        StorageStatementExecutor storageStatementExecutor = new StorageStatementExecutor(new sls() { // from class: com.yandex.div.storage.DivStorageImpl$dropTables$1
            {
                super(0);
            }

            public final c.b b() {
                return c.b.this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return c.b.this;
            }
        });
        StorageStatements.a.getClass();
        storageStatementExecutor.c(new StorageStatements.d());
    }

    /* renamed from: z, reason: from getter */
    public final StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$a;", "", "<init>", "()V", "T", "", "", "b", "(Ljava/util/Collection;)Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.DivStorageImpl$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String b(Collection<? extends T> collection) {
            return kotlin.collections.a.X(collection, "', '", "('", "')", null, 56);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ DivStorageImpl(Context context, com.yandex.div.storage.database.d dVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, (i & 4) != 0 ? "" : str);
    }
}
