package yads;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.na8;

/* loaded from: classes10.dex */
public abstract class au1 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static px a(int i, kc2 kc2Var) {
        int b = kc2Var.b();
        if (kc2Var.b() == 1684108385) {
            kc2Var.e(kc2Var.b + 8);
            String b2 = kc2Var.b(b - 16);
            return new px(C.LANGUAGE_UNDETERMINED, b2, b2);
        }
        ji1.d("MetadataUtil", "Failed to parse comment attribute: " + xj.a(i));
        return null;
    }

    public static cd1 b(int i, kc2 kc2Var) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = kc2Var.b;
            if (i4 >= i) {
                break;
            }
            int b = kc2Var.b();
            int b2 = kc2Var.b();
            kc2Var.e(kc2Var.b + 4);
            if (b2 == 1835360622) {
                str = kc2Var.b(b - 12);
            } else if (b2 == 1851878757) {
                str2 = kc2Var.b(b - 12);
            } else {
                if (b2 == 1684108385) {
                    i2 = i4;
                    i3 = b;
                }
                kc2Var.e(kc2Var.b + (b - 12));
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        kc2Var.e(i2);
        kc2Var.e(kc2Var.b + 16);
        return new cd1(str, str2, kc2Var.b(i3 - 16));
    }

    public static ag a(kc2 kc2Var) {
        String str;
        int b = kc2Var.b();
        if (kc2Var.b() == 1684108385) {
            int b2 = kc2Var.b() & 16777215;
            if (b2 == 13) {
                str = "image/jpeg";
            } else {
                str = b2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                lg1.a("Unrecognized cover art flags: ", b2, "MetadataUtil");
                return null;
            }
            kc2Var.e(kc2Var.b + 4);
            int i = b - 16;
            byte[] bArr = new byte[i];
            kc2Var.a(bArr, 0, i);
            return new ag(str, null, 3, bArr);
        }
        ji1.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static c73 b(int i, kc2 kc2Var, String str) {
        int b = kc2Var.b();
        if (kc2Var.b() == 1684108385) {
            kc2Var.e(kc2Var.b + 8);
            return new c73(str, null, kc2Var.b(b - 16));
        }
        ji1.d("MetadataUtil", "Failed to parse text attribute: " + xj.a(i));
        return null;
    }

    public static c73 a(int i, kc2 kc2Var, String str) {
        int b = kc2Var.b();
        if (kc2Var.b() == 1684108385 && b >= 22) {
            kc2Var.e(kc2Var.b + 10);
            int r = kc2Var.r();
            if (r > 0) {
                String a2 = nh2.a("", r);
                int r2 = kc2Var.r();
                if (r2 > 0) {
                    a2 = na8.a(r2, a2, DomExceptionUtils.SEPARATOR);
                }
                return new c73(str, null, a2);
            }
        }
        ji1.d("MetadataUtil", "Failed to parse index/count attribute: " + xj.a(i));
        return null;
    }

    public static x21 a(int i, String str, kc2 kc2Var, boolean z, boolean z2) {
        int i2;
        kc2Var.e(kc2Var.b + 4);
        if (kc2Var.b() == 1684108385) {
            kc2Var.e(kc2Var.b + 8);
            i2 = kc2Var.m();
        } else {
            ji1.d("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            if (z) {
                return new c73(str, null, Integer.toString(i2));
            }
            return new px(C.LANGUAGE_UNDETERMINED, str, Integer.toString(i2));
        }
        ji1.d("MetadataUtil", "Failed to parse uint8 attribute: " + xj.a(i));
        return null;
    }
}
