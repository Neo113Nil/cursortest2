package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes10.dex */
public abstract class e890 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public void a(ViewPager viewPager, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public Object d(ViewPager viewPager, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean e(View view, Object obj);

    public final void f() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.notifyChanged();
    }

    public final void g(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public void h(Parcelable parcelable) {
    }

    public Parcelable i() {
        return null;
    }

    public final void j(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public final void k(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
