package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class dlj implements gog {
    public final Resources.Theme a;
    public final Resources b;
    public final clj c;
    public final int w;
    public Object x;

    public dlj(Resources.Theme theme, Resources resources, clj cljVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = cljVar;
        this.w = i;
    }

    @Override // defpackage.gog
    public final Class a() {
        switch (this.c.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        Object openRawResourceFd;
        try {
            clj cljVar = this.c;
            Resources.Theme theme = this.a;
            Resources resources = this.b;
            int i = this.w;
            switch (cljVar.a) {
                case 0:
                    openRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = cljVar.b;
                    openRawResourceFd = jm91.e(context, context, i, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.x = openRawResourceFd;
            fogVar.d(openRawResourceFd);
        } catch (Resources.NotFoundException e) {
            fogVar.e(e);
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
    }

    @Override // defpackage.gog
    public final void cleanup() {
        Object obj = this.x;
        if (obj != null) {
            try {
                switch (this.c.a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }
}
