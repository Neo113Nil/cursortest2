package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ilq0;
import xsna.jlq0;

/* compiled from: UserPlacesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class llq0 implements klq0 {
    public final jlq0 a;
    public final jlq0 b;

    /* compiled from: UserPlacesRepositoryImpl.kt */
    public static final class a implements jlq0.a<nec> {
        @Override // xsna.jlq0.a
        public final List<nec> a(Collection<Integer> collection) {
            ztb0 ztb0Var = new ztb0("database.getCitiesById");
            ztb0Var.j("city_ids", j5g.g0(collection, null, null, null, 0, null, 63));
            List<nec> list = (List) ztb0Var.u(0L);
            return list == null ? EmptyList.b : list;
        }
    }

    /* compiled from: UserPlacesRepositoryImpl.kt */
    public static final class b implements ilq0.a<nec> {
        @Override // xsna.ilq0.a
        public final int a(nec necVar) {
            return necVar.a;
        }

        @Override // xsna.ilq0.a
        public final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cities");
            sQLiteDatabase.execSQL("CREATE TABLE cities (id int not null, title text, unique(id) on conflict replace)");
        }

        @Override // xsna.ilq0.a
        public final ContentValues c(nec necVar) {
            nec necVar2 = necVar;
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(necVar2.a));
            contentValues.put("title", necVar2.b);
            return contentValues;
        }

        @Override // xsna.ilq0.a
        public final nec d(ContentValues contentValues) {
            return new nec(contentValues.getAsInteger("id").intValue(), contentValues.getAsString("title"));
        }

        @Override // xsna.ilq0.a
        public final String getTableName() {
            return "cities";
        }
    }

    /* compiled from: UserPlacesRepositoryImpl.kt */
    public static final class c implements jlq0.a<vyj> {
        @Override // xsna.jlq0.a
        public final List<vyj> a(Collection<Integer> collection) {
            iwk iwkVar = new iwk("database.getCountriesById");
            iwkVar.j("country_ids", j5g.g0(collection, null, null, null, 0, null, 63));
            List<vyj> list = (List) iwkVar.u(0L);
            return list == null ? EmptyList.b : list;
        }
    }

    /* compiled from: UserPlacesRepositoryImpl.kt */
    public static final class d implements ilq0.a<vyj> {
        @Override // xsna.ilq0.a
        public final int a(vyj vyjVar) {
            return vyjVar.a;
        }

        @Override // xsna.ilq0.a
        public final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS countries");
            sQLiteDatabase.execSQL("CREATE TABLE countries (id int not null, title text, unique(id) on conflict replace)");
        }

        @Override // xsna.ilq0.a
        public final ContentValues c(vyj vyjVar) {
            vyj vyjVar2 = vyjVar;
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(vyjVar2.a));
            contentValues.put("title", vyjVar2.b);
            return contentValues;
        }

        @Override // xsna.ilq0.a
        public final vyj d(ContentValues contentValues) {
            return new vyj(contentValues.getAsInteger("id").intValue(), contentValues.getAsString("title"));
        }

        @Override // xsna.ilq0.a
        public final String getTableName() {
            return "countries";
        }
    }

    public llq0() {
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
        this.a = new jlq0(aVar, bVar);
        this.b = new jlq0(cVar, dVar);
    }

    @Override // xsna.klq0
    public final List J0(HashSet hashSet) {
        return this.b.b(hashSet);
    }

    @Override // xsna.xic
    public final void clear() {
        jlq0 jlq0Var = this.a;
        jlq0Var.d.clear();
        ilq0<T> ilq0Var = jlq0Var.c;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ilq0Var.a.b(gr80.b(context).getWritableDatabase());
        jlq0 jlq0Var2 = this.b;
        jlq0Var2.d.clear();
        ilq0<T> ilq0Var2 = jlq0Var2.c;
        Context context2 = e43.a;
        ilq0Var2.a.b(gr80.b(context2 != null ? context2 : null).getWritableDatabase());
    }

    @Override // xsna.klq0
    public final List l0(HashSet hashSet) {
        return this.a.b(hashSet);
    }

    @Override // xsna.xic
    public final long u() {
        this.a.getClass();
        this.b.getClass();
        return 0L;
    }
}
