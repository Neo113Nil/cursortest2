package xsna;

import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.internal.storage.structure.DbException;
import com.vk.im.engine.internal.storage.structure.Table;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b2l;
import xsna.pxn0;

/* compiled from: DbMigration.kt */
/* loaded from: classes.dex */
public final class c2l implements b2l {
    public static final c2l a;
    public static final LinkedHashMap<Integer, izs<b2l.a, s3q0>> b;

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 28);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 36);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class a1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 43);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("DROP TABLE IF EXISTS dialogs_sharing_weight");
            aVar2.a().execSQL("DROP INDEX IF EXISTS idx_messages_time_is_incoming");
            aVar2.a().execSQL("DROP INDEX IF EXISTS idx_message_attaches_date_content_type");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class b1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.GROUPS, "is_monetization_available", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("UPDATE " + Table.CHANNEL_MESSAGES.i() + " SET phase_id = 0, donut = NULL WHERE donut IS NOT NULL");
            aVar2.a().execSQL("UPDATE " + Table.CHANNEL_POSTPONED_MESSAGES.i() + " SET phase_id = 0, donut = NULL WHERE donut IS NOT NULL");
            c2l.g(aVar2, 1);
            c2l.g(aVar2, 24);
            c2l.g(aVar2, 2);
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 32);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 10);
            c2l.g(aVar2, 28);
            c2l.g(aVar2, 15);
            c2l.g(aVar2, 23);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 16);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 36);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("DELETE FROM key_value WHERE key = 'dialogs_list_info_bar'");
            aVar2.a().execSQL("UPDATE " + Table.DIALOGS.i() + " SET bar_payload = NULL, phase_id = 0 WHERE bar_payload IS NOT NULL");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class c1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            Table.IM_ITEM_HISTORY_META.a(aVar2.a());
            Table.IM_ITEM_WEIGHT.a(aVar2.a());
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            for (Table table : e43.l(Table.CHANNEL_MESSAGES, Table.CHANNEL_POSTPONED_MESSAGES)) {
                c2l c2lVar3 = c2l.a;
                SQLiteDatabase a = aVar2.a();
                c2lVar3.getClass();
                c2l.b(a, table, "guid", "TEXT");
                c2l.b(aVar2.a(), table, "sync_state", "INT NOT NULL DEFAULT 0");
                c2l.b(aVar2.a(), table, "sync_config", "TEXT");
            }
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class d1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 18);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class e1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNEL_MESSAGES;
            ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.BODY_FORMAT;
            c2l.b(a, table, channelMessageColumn.getKey(), "TEXT");
            c2l.b(aVar2.a(), Table.CHANNEL_POSTPONED_MESSAGES, channelMessageColumn.getKey(), "TEXT");
            c2l.g(aVar2, 42);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class f0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 43);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class f1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.IM_ITEM_HISTORY_META;
            c2l.b(a, table, "has_dialogs_error", "INT NOT NULL DEFAULT 0");
            c2l.b(aVar2.a(), table, "has_channels_error", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.CHANNELS, ChannelsDb.Column.PINNED_MSGS_PHASE.getKey(), "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class g1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            Table.MESSAGE_TEMPLATES.a(aVar.a());
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class h0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class h1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 18);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 43);
            c2l.g(aVar2, 6);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar2);
            c2l.g(aVar2, 42);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class i1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            Iterator it = n34.E().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                c2l.a.getClass();
                c2l.g(aVar2, intValue);
            }
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class j0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar2.a(), Table.GROUPS, "is_non_profit_organization", "INT NOT NULL DEFAULT 0");
            aVar2.a().execSQL("DELETE FROM key_value WHERE key = 'account_info'");
            c2l.f(aVar2);
            c2l.g(aVar2, 16, 10, 34, 20, 35, 28, 36, 18);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class j1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("DELETE FROM " + Table.IM_ITEM_WEIGHT.i());
            aVar2.a().execSQL("DELETE FROM " + Table.IM_ITEM_HISTORY_META);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 28);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 36);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class k0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class k1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.f(aVar2);
            c2l.g(aVar2, 16, 10, 34, 20, 35, 28, 36, 18);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class l0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 43);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class l1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("DELETE FROM " + Table.IM_ITEM_WEIGHT.i());
            aVar2.a().execSQL("DELETE FROM " + Table.IM_ITEM_HISTORY_META.i());
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 43);
            c2l.g(aVar2, 6);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class m0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 9);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class m1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.CHANNELS, "paid_reactions_enabled", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class n0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 42);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class n1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class o0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            aVar2.a().execSQL("DELETE FROM key_value WHERE key = 'dialogs_list_info_bar'");
            c2l.b(aVar2.a(), Table.DIALOGS, "bar_lego_icon", "TEXT DEFAULT \"\"");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class o1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.CHANNELS, "paid_reaction_cost", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.IM_ITEM_HISTORY_META;
            a.execSQL("DROP TABLE IF EXISTS " + table.i());
            table.a(a);
            c2l.b(aVar2.a(), Table.DIALOGS, "timestamp", "INT");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class p0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class p1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            Table.DIALOG_TAGS.a(aVar2.a());
            c2l.b(aVar2.a(), Table.DIALOGS, "tags", "BLOB");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNELS;
            c2l.b(a, table, ChannelsDb.Column.CAN_POST.getKey(), "INT");
            c2l.b(aVar2.a(), table, ChannelsDb.Column.ADMIN_LEVEL.getKey(), "INT");
            c2l.b(aVar2.a(), Table.USERS, "is_adult", "INT");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class q0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNELS;
            c2l.b(a, table, "is_hidden_in_all_folder", "INT NOT NULL DEFAULT 0");
            aVar2.a().execSQL("UPDATE " + table.i() + " SET phase = 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class q1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNEL_MESSAGES;
            ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.PAID_REACTION;
            c2l.b(a, table, channelMessageColumn.getKey(), "BLOB");
            c2l.b(aVar2.a(), Table.CHANNEL_POSTPONED_MESSAGES, channelMessageColumn.getKey(), "BLOB");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class r0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class r1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 34);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 28);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 36);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 10);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class s0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 9);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class s1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar2);
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class t0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.DIALOG_THEMES, "last_sync_time_ms", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class t1 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNEL_MESSAGES;
            ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.IS_MSG_PINNED;
            c2l.b(a, table, channelMessageColumn.getKey(), "INT");
            c2l.b(aVar2.a(), Table.CHANNEL_POSTPONED_MESSAGES, channelMessageColumn.getKey(), "INT");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 6);
            c2l.g(aVar2, 7);
            c2l.g(aVar2, 43);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class u0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class v0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.GROUPS, "need_show_onboarding", "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.e(aVar2);
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class w0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar2.a(), Table.CHANNEL_MESSAGES, "is_donut_photos", "INT NOT NULL DEFAULT 0");
            c2l.b(aVar2.a(), Table.CHANNEL_POSTPONED_MESSAGES, "is_donut_photos", "INT NOT NULL DEFAULT 0");
            c2l.g(aVar2, 9);
            c2l.g(aVar2, 42);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.b(aVar.a(), Table.CHANNELS, ChannelsDb.Column.IS_ADULT.getKey(), "INT NOT NULL DEFAULT 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class x0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 10);
            c2l.g(aVar2, 28);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            c2l.g(aVar2, 36);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar, 42);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class y0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar2.a();
            Table table = Table.CHANNELS;
            c2l.b(a, table, "can_post_donut", "INT NOT NULL DEFAULT 0");
            aVar2.a().execSQL("UPDATE " + table.i() + " SET phase = 0");
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            b2l.a aVar2 = aVar;
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            c2l.g(aVar2, 42);
            c2l.g(aVar2, 34);
            c2l.g(aVar2, 18);
            c2l.g(aVar2, 20);
            c2l.g(aVar2, 35);
            c2l.g(aVar2, 21);
            return s3q0.a;
        }
    }

    /* compiled from: DbMigration.kt */
    public static final /* synthetic */ class z0 extends FunctionReferenceImpl implements izs<b2l.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b2l.a aVar) {
            c2l c2lVar = (c2l) this.receiver;
            c2l c2lVar2 = c2l.a;
            c2lVar.getClass();
            SQLiteDatabase a = aVar.a();
            pxn0.a aVar2 = new pxn0.a();
            a.execSQL("DROP TABLE IF EXISTS " + aVar2.c());
            aVar2.b(a);
            aVar2.a(a);
            return s3q0.a;
        }
    }

    static {
        c2l c2lVar = new c2l();
        a = c2lVar;
        b = pn00.j(new Pair(Integer.valueOf(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW), new k(1, c2lVar, c2l.class, "to1036", "to1036(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_IS_LOAD_DURING_SHOW), new v(1, c2lVar, c2l.class, "to1037", "to1037(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_RV_SHOW_EXCEPTION), new g0(1, c2lVar, c2l.class, "to1038", "to1038(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_IS_SHOW_EXCEPTION), new r0(1, c2lVar, c2l.class, "to1039", "to1039(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION), new c1(1, c2lVar, c2l.class, "to1040", "to1040(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION), new n1(1, c2lVar, c2l.class, "to1041", "to1041(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED), new r1(1, c2lVar, c2l.class, "to1042", "to1042(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED), new s1(1, c2lVar, c2l.class, "to1043", "to1043(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES), new t1(1, c2lVar, c2l.class, "to1044", "to1044(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES), new a(1, c2lVar, c2l.class, "to1045", "to1045(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1046, new b(1, c2lVar, c2l.class, "to1046", "to1046(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1047, new c(1, c2lVar, c2l.class, "to1047", "to1047(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1048, new d(1, c2lVar, c2l.class, "to1048", "to1048(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1049, new e(1, c2lVar, c2l.class, "to1049", "to1049(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1050, new f(1, c2lVar, c2l.class, "to1050", "to1050(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW), new g(1, c2lVar, c2l.class, "to1051", "to1051(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1052, new h(1, c2lVar, c2l.class, "to1052", "to1052(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1053, new i(1, c2lVar, c2l.class, "to1053", "to1053(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW), new j(1, c2lVar, c2l.class, "to1054", "to1054(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1055, new l(1, c2lVar, c2l.class, "to1055", "to1055(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW), new m(1, c2lVar, c2l.class, "to1056", "to1056(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS), new n(1, c2lVar, c2l.class, "to1057", "to1057(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1058, new o(1, c2lVar, c2l.class, "to1058", "to1058(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1059, new p(1, c2lVar, c2l.class, "to1059", "to1059(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1060, new q(1, c2lVar, c2l.class, "to1060", "to1060(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY), new r(1, c2lVar, c2l.class, "to1061", "to1061(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1062, new s(1, c2lVar, c2l.class, "to1062", "to1062(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1063, new t(1, c2lVar, c2l.class, "to1063", "to1063(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1064, new u(1, c2lVar, c2l.class, "to1064", "to1064(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1065, new w(1, c2lVar, c2l.class, "to1065", "to1065(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1066, new x(1, c2lVar, c2l.class, "to1066", "to1066(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1067, new y(1, c2lVar, c2l.class, "to1067", "to1067(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1068, new z(1, c2lVar, c2l.class, "to1068", "to1068(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1069, new a0(1, c2lVar, c2l.class, "to1069", "to1069(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(j.a.j), new b0(1, c2lVar, c2l.class, "to1070", "to1070(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(j.a.k), new c0(1, c2lVar, c2l.class, "to1071", "to1071(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1072, new d0(1, c2lVar, c2l.class, "to1072", "to1072(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1073, new e0(1, c2lVar, c2l.class, "to1073", "to1073(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1074, new f0(1, c2lVar, c2l.class, "to1074", "to1074(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1075, new h0(1, c2lVar, c2l.class, "to1075", "to1075(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1076, new i0(1, c2lVar, c2l.class, "to1076", "to1076(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1077, new j0(1, c2lVar, c2l.class, "to1077", "to1077(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1078, new k0(1, c2lVar, c2l.class, "to1078", "to1078(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1079, new l0(1, c2lVar, c2l.class, "to1079", "to1079(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1080, new m0(1, c2lVar, c2l.class, "to1080", "to1080(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1081, new n0(1, c2lVar, c2l.class, "to1081", "to1081(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1082, new o0(1, c2lVar, c2l.class, "to1082", "to1082(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1083, new p0(1, c2lVar, c2l.class, "to1083", "to1083(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1084, new q0(1, c2lVar, c2l.class, "to1084", "to1084(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1085, new s0(1, c2lVar, c2l.class, "to1085", "to1085(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1086, new t0(1, c2lVar, c2l.class, "to1086", "to1086(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1087, new u0(1, c2lVar, c2l.class, "to1087", "to1087(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1088, new v0(1, c2lVar, c2l.class, "to1088", "to1088(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1089, new w0(1, c2lVar, c2l.class, "to1089", "to1089(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1090, new x0(1, c2lVar, c2l.class, "to1090", "to1090(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1091, new y0(1, c2lVar, c2l.class, "to1091", "to1091(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1092, new z0(1, c2lVar, c2l.class, "to1092", "to1092(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1093, new a1(1, c2lVar, c2l.class, "to1093", "to1093(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1094, new b1(1, c2lVar, c2l.class, "to1094", "to1094(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1095, new d1(1, c2lVar, c2l.class, "to1095", "to1095(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1096, new e1(1, c2lVar, c2l.class, "to1096", "to1096(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1097, new f1(1, c2lVar, c2l.class, "to1097", "to1097(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1098, new g1(1, c2lVar, c2l.class, "to1098", "to1098(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1099, new h1(1, c2lVar, c2l.class, "to1099", "to1099(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1100, new i1(1, c2lVar, c2l.class, "to1100", "to1100(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1101, new j1(1, c2lVar, c2l.class, "to1101", "to1101(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1102, new k1(1, c2lVar, c2l.class, "to1102", "to1102(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(Integer.valueOf(ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED), new l1(1, c2lVar, c2l.class, "to1103", "to1103(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1104, new m1(1, c2lVar, c2l.class, "to1104", "to1104(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1105, new o1(1, c2lVar, c2l.class, "to1105", "to1105(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1106, new p1(1, c2lVar, c2l.class, "to1106", "to1106(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)), new Pair(1107, new q1(1, c2lVar, c2l.class, "to1107", "to1107(Lcom/vk/im/engine/internal/storage/structure/DbMigration$Args;)V", 0)));
    }

    public static void b(SQLiteDatabase sQLiteDatabase, Table table, String str, String str2) {
        String i2 = table.i();
        try {
            if (rdi.o(sQLiteDatabase, i2, str, str2)) {
                return;
            }
            sQLiteDatabase.execSQL("ALTER TABLE " + i2 + " ADD COLUMN " + str + ' ' + str2);
        } catch (Throwable th) {
            throw new IllegalStateException("Possibly, you are about to create column that already exists with different type. Use other column name.", th);
        }
    }

    public static String c(int i2) {
        String a2 = lhg.a(i2, "WHERE content_type = ");
        return h5s.d(xe9.a("\n                UPDATE messages\n                SET phase_id = 0, attach = NULL, nested = NULL\n                WHERE local_id IN(\n                    SELECT msg_local_id\n                    FROM message_attaches\n                    ", a2, ");\n    \n                UPDATE dialogs\n                SET phase_id = 0,\n                    pinned_msg_visible = 0,\n                    pinned_msg_exists = 0,\n                    pinned_msg_cnv_msg_id = NULL,\n                    pinned_msg_is_unavailable = NULL,\n                    pinned_msg_from_type = NULL,\n                    pinned_msg_from_id = NULL,\n                    pinned_msg_time = NULL,\n                    pinned_msg_title = NULL,\n                    pinned_msg_body = NULL,\n                    pinned_msg_body_format = NULL,\n                    pinned_msg_attaches = NULL,\n                    pinned_msg_nested = NULL\n                WHERE id IN(\n                    SELECT dialog_id\n                    FROM dialog_pinned_msg_attaches\n                    ", a2, ");\n    \n                DELETE FROM message_attaches "), a2, ";\n                DELETE FROM dialog_pinned_msg_attaches ", a2, ";\n                ");
    }

    public static void d(String str, b2l.a aVar) {
        List b02 = drm0.b0(ahn.B(str), new char[]{';'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b02) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.a().execSQL((String) it.next());
        }
    }

    public static void e(b2l.a aVar) {
        Iterator it = n34.F().iterator();
        while (it.hasNext()) {
            int[] iArr = {((Number) it.next()).intValue()};
            a.getClass();
            g(aVar, iArr);
        }
    }

    public static void f(b2l.a aVar) {
        aVar.a().execSQL("UPDATE " + Table.USERS.i() + " SET image_status = NULL, sync_time_overall = 0, sync_time_online = 0");
    }

    public static void g(b2l.a aVar, int... iArr) {
        Integer[] B = jw5.B(iArr);
        ArrayList arrayList = new ArrayList();
        for (Integer num : B) {
            int intValue = num.intValue();
            if (intValue != 21 && intValue != 42) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            a.getClass();
            d(c(intValue2), aVar);
        }
        d(c(21), aVar);
        d(c(42), aVar);
        if (aVar.b() <= 913) {
            aVar.a().execSQL("DELETE FROM " + Table.CHANNEL_MESSAGES.i());
            if (aVar.b() > 901) {
                aVar.a().execSQL("DELETE FROM " + Table.CHANNEL_POSTPONED_MESSAGES.i());
                return;
            }
            return;
        }
        String g02 = j5g.g0(j5g.v0(42, j5g.v0(21, rl3.w0(B))), StringUtils.COMMA, null, null, 0, null, 62);
        Iterator it2 = e43.l(Table.CHANNEL_MESSAGES, Table.CHANNEL_POSTPONED_MESSAGES).iterator();
        while (it2.hasNext()) {
            aVar.a().execSQL(xqm0.g("\n                    UPDATE " + ((Table) it2.next()).i() + " \n                    SET phase_id = 0, attach = NULL \n                    WHERE local_id IN(\n                        SELECT msg_local_id \n                        FROM channel_message_attaches \n                        WHERE content_type IN (" + g02 + ")\n                    );\n                "));
        }
        aVar.a().execSQL("DELETE FROM " + Table.CHANNEL_MESSAGE_ATTACHES.i() + " WHERE content_type IN (" + g02 + ')');
    }

    @Override // xsna.b2l
    public final void a(b2l.a aVar) throws DbException {
        sa30.l(aVar.a(), new mre(aVar, 13));
    }
}
