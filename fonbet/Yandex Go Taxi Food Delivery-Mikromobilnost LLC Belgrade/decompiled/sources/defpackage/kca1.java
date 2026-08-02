package defpackage;

import android.content.Context;
import com.yandex.go.diagnostic_qr.network.QrDiagnosticDataApi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import ru.yandex.taxi.network.api.models.GoApiName;
import yads.bx;
import yads.c43;
import yads.g11;
import yads.ua1;

/* loaded from: classes7.dex */
public abstract class kca1 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static c43 a(int i, String str, dl81 dl81Var) {
        int a2 = dl81Var.a();
        if (dl81Var.a() == 1684108385 && a2 >= 22) {
            dl81Var.m(dl81Var.b + 10);
            int x = dl81Var.x();
            if (x > 0) {
                String c = q8a1.c(x, "");
                int x2 = dl81Var.x();
                if (x2 > 0) {
                    c = qv10.h(x2, c, "/");
                }
                return new c43(str, null, c);
            }
        }
        ay4.a(i);
        nba1.e();
        return null;
    }

    public static g11 b(int i, String str, dl81 dl81Var, boolean z, boolean z2) {
        int i2;
        dl81Var.m(dl81Var.b + 4);
        if (dl81Var.a() == 1684108385) {
            dl81Var.m(dl81Var.b + 8);
            i2 = dl81Var.s();
        } else {
            nba1.e();
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new c43(str, null, Integer.toString(i2)) : new bx("und", str, Integer.toString(i2));
        }
        ay4.a(i);
        nba1.e();
        return null;
    }

    public static final void c(Context context, HashMap hashMap) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        if (a2 == null || !a2.B) {
            return;
        }
        hashMap.put("encrypted-request", "1");
    }

    public static c43 d(int i, String str, dl81 dl81Var) {
        int a2 = dl81Var.a();
        if (dl81Var.a() == 1684108385) {
            dl81Var.m(dl81Var.b + 8);
            return new c43(str, null, dl81Var.g(a2 - 16));
        }
        ay4.a(i);
        nba1.e();
        return null;
    }

    public static ua1 e(int i, dl81 dl81Var) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = dl81Var.b;
            if (i4 >= i) {
                break;
            }
            int a2 = dl81Var.a();
            int a3 = dl81Var.a();
            dl81Var.m(dl81Var.b + 4);
            if (a3 == 1835360622) {
                str = dl81Var.g(a2 - 12);
            } else if (a3 == 1851878757) {
                str2 = dl81Var.g(a2 - 12);
            } else {
                if (a3 == 1684108385) {
                    i2 = i4;
                    i3 = a2;
                }
                dl81Var.m(dl81Var.b + (a2 - 12));
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        dl81Var.m(i2);
        dl81Var.m(dl81Var.b + 16);
        return new ua1(str, str2, dl81Var.g(i3 - 16));
    }

    public static QrDiagnosticDataApi f(on2 on2Var) {
        on2Var.getClass();
        return (QrDiagnosticDataApi) on2Var.a(GoApiName.TaxiV4, QrDiagnosticDataApi.class);
    }

    public static final String g(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                exc.printStackTrace(printWriter);
                printWriter.close();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                return stringWriter2;
            } finally {
            }
        } finally {
        }
    }
}
