package xsna;

import android.text.SpannableStringBuilder;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.user.ImageStatus;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderBadge;
import com.vk.feed.core.models.header.HeaderIcon;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.header.IconSize;
import com.vk.newsfeed.presentation.model.ActionsMenuType;
import com.vk.newsfeed.presentation.model.actions.ActionOpenClipMusicGrid;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import xsna.yye0;

/* compiled from: ImItemListByIdLoader.kt */
/* loaded from: classes2.dex */
public final class q5w implements gn60, yye0.a {
    public final Object b;
    public final Object c;

    public /* synthetic */ q5w(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(71:0|1|(1:390)(1:3)|(1:5)(1:387)|(3:7|(1:9)(1:385)|(63:11|12|(1:14)(1:384)|(1:16)(1:383)|(1:382)(1:27)|(1:29)(1:373)|(1:372)(1:35)|(1:371)(3:39|(1:41)(3:366|(1:368)|370)|42)|(3:46|(1:364)(1:50)|(52:52|53|(2:(2:56|57)|292)(6:293|(1:295)(1:(1:362)(1:363))|(1:297)(1:360)|298|(1:300)(1:359)|(2:(2:303|57)|292)(6:304|(2:307|305)|308|(1:358)(3:312|(6:315|(1:317)(1:324)|318|(2:320|321)(1:323)|322|313)|325)|326|(1:328)(4:329|(2:351|(1:(1:357)(1:356)))(1:334)|335|(4:337|(2:338|(2:340|(1:343)(1:342))(2:348|349))|(1:345)(1:347)|346)(1:350))))|(5:59|(1:(1:289)(1:290))|65|(1:67)(2:(1:268)(1:287)|(3:(1:286)(1:278)|(1:285)|274)(2:(1:273)|274))|68)(1:291)|69|(1:266)(1:75)|76|77|(1:79)(1:257)|(1:81)(1:256)|(2:83|(40:87|(1:89)(1:254)|90|(1:253)(2:94|(36:96|97|(1:99)(1:251)|(4:101|(6:104|(1:106)(1:127)|107|(2:(1:115)(1:126)|(3:(1:120)(1:123)|121|122))(2:111|112)|113|102)|128|129)(1:250)|(2:131|(3:135|(3:138|(2:140|141)(1:247)|136)|248))|249|(28:(2:239|(1:243))(1:146)|147|(1:149)(1:238)|(2:(2:152|(1:154))(1:221)|220)(2:222|(3:224|(2:226|(1:228))|220)(2:(1:(2:232|(2:234|(1:236))))|220))|(1:219)(2:162|(17:164|(1:217)(1:168)|(1:216)(1:172)|(1:215)(1:(1:176)(1:214))|(1:178)(1:(1:212)(1:213))|(1:210)(1:184)|(1:209)(1:188)|189|190|(1:192)(1:208)|(1:194)(1:207)|(1:206)|198|(1:200)(1:205)|201|202|203))|218|(0)|217|(1:170)|216|(0)|215|(0)(0)|(1:180)|210|(1:186)|209|189|190|(0)(0)|(0)(0)|(1:196)|206|198|(0)(0)|201|202|203)|246|245|(0)(0)|(0)(0)|(1:158)|219|218|(0)|217|(0)|216|(0)|215|(0)(0)|(0)|210|(0)|209|189|190|(0)(0)|(0)(0)|(0)|206|198|(0)(0)|201|202|203))|252|97|(0)(0)|(0)(0)|(0)|249|(0)|246|245|(0)(0)|(0)(0)|(0)|219|218|(0)|217|(0)|216|(0)|215|(0)(0)|(0)|210|(0)|209|189|190|(0)(0)|(0)(0)|(0)|206|198|(0)(0)|201|202|203))|255|(0)(0)|90|(1:92)|253|252|97|(0)(0)|(0)(0)|(0)|249|(0)|246|245|(0)(0)|(0)(0)|(0)|219|218|(0)|217|(0)|216|(0)|215|(0)(0)|(0)|210|(0)|209|189|190|(0)(0)|(0)(0)|(0)|206|198|(0)(0)|201|202|203))|365|53|(0)(0)|(0)(0)|69|(2:71|73)|264|266|76|77|(0)(0)|(0)(0)|(0)|255|(0)(0)|90|(0)|253|252|97|(0)(0)|(0)(0)|(0)|249|(0)|246|245|(0)(0)|(0)(0)|(0)|219|218|(0)|217|(0)|216|(0)|215|(0)(0)|(0)|210|(0)|209|189|190|(0)(0)|(0)(0)|(0)|206|198|(0)(0)|201|202|203))|386|12|(0)(0)|(0)(0)|(1:374)|382|(0)(0)|(1:31)|372|(1:37)|371|(5:44|46|(1:48)|364|(0))|365|53|(0)(0)|(0)(0)|69|(0)|264|266|76|77|(0)(0)|(0)(0)|(0)|255|(0)(0)|90|(0)|253|252|97|(0)(0)|(0)(0)|(0)|249|(0)|246|245|(0)(0)|(0)(0)|(0)|219|218|(0)|217|(0)|216|(0)|215|(0)(0)|(0)|210|(0)|209|189|190|(0)(0)|(0)(0)|(0)|206|198|(0)(0)|201|202|203) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0421, code lost:
    
        if (((com.vk.dto.newsfeed.entries.Post) r2).mc() != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0423, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0441, code lost:
    
        if (r1.mc() != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0457, code lost:
    
        if (((com.vk.dto.newsfeed.entries.Videos) r2).Rb() != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0403, code lost:
    
        if (xsna.fkq0.c(r5) == true) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02ee, code lost:
    
        com.vk.metrics.eventtracking.b.a.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x02f3, code lost:
    
        if (r17 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02f6, code lost:
    
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x02f8, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00eb, code lost:
    
        if (r13 != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List a(int i, Triple triple) {
        boolean z;
        String str;
        boolean D;
        boolean F;
        ImageStatus imageStatus;
        NewsEntry newsEntry;
        boolean z2;
        ArrayList arrayList;
        String str2;
        List<Description> singletonList;
        List<Description> list;
        String str3;
        boolean z3;
        boolean z4;
        String str4;
        boolean z5;
        boolean z6;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        HeaderBadge headerBadge;
        Text text;
        HeaderTitle headerTitle;
        SourcePhoto sourcePhoto;
        Owner d;
        String str9;
        Image image;
        Image image2;
        Owner d2;
        String str10;
        Owner d3;
        Owner d4;
        List list2;
        Post R;
        Owner owner;
        NewsEntry newsEntry2;
        HeaderBadge headerBadge2;
        Text text2;
        Owner s;
        VerifyInfo verifyInfo;
        EntryHeader header;
        HeaderTitle headerTitle2;
        VerifyInfo verifyInfo2;
        ?? r2 = (NewsEntry) triple.d();
        NewsEntry newsEntry3 = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        EntryHeader d5 = na60.d(r2);
        boolean z14 = r2 instanceof Post;
        boolean z15 = !z14 && ((r2 instanceof PromoPost) || !((r2 instanceof Photos) || (r2 instanceof Videos) || (r2 instanceof FaveEntry) || (!(r2 instanceof Html5Entry) && !(r2 instanceof ShitAttachment) && !(r2 instanceof MyTargetNativeAdEntry))));
        HeaderTitle headerTitle3 = d5 != null ? d5.c : null;
        if (headerTitle3 != null) {
            List<Text> list3 = headerTitle3.c;
            Text text3 = list3 != null ? (Text) j5g.a0(list3) : null;
            if (text3 != null) {
                z = z14;
                str = text3.b;
                boolean z16 = r2 instanceof wsx0;
                D = !z16 ? di60.D(r2) : false;
                F = !z16 ? di60.F(r2) : false;
                boolean z17 = !z16 && (!(!z16 || (header = ((wsx0) r2).getHeader()) == null || (headerTitle2 = header.c) == null || (verifyInfo2 = headerTitle2.e) == null || !verifyInfo2.Cb()) || ((r2 instanceof l490) && (s = ((l490) r2).s()) != null && (verifyInfo = s.f) != null && verifyInfo.Cb()));
                imageStatus = headerTitle3 == null ? headerTitle3.d : null;
                String str11 = (d5 != null || (headerBadge2 = d5.d) == null || (text2 = headerBadge2.b) == null) ? null : text2.b;
                if (!z || (r2 instanceof Videos)) {
                    newsEntry = r2;
                } else {
                    if (r2 instanceof PromoPost) {
                        newsEntry2 = ((PromoPost) r2).n;
                    } else {
                        if (r2 instanceof ShitAttachment) {
                            ShitAttachment shitAttachment = (ShitAttachment) r2;
                            boolean Gb = shitAttachment.Gb();
                            newsEntry2 = shitAttachment;
                        }
                        newsEntry = null;
                    }
                    newsEntry = newsEntry2;
                }
                if (!z15 && ((Boolean) this.b.getValue()).booleanValue()) {
                    R = di60.R(r2);
                    if ((R != null || (owner = R.o) == null) ? false : owner.w) {
                        z2 = true;
                        String str12 = "";
                        if (((Boolean) this.c.getValue()).booleanValue()) {
                            VideoAttachment j = r2 instanceof Videos ? di60.j((Videos) r2) : z ? di60.i((Post) r2) : null;
                            VideoFile videoFile = j != null ? j.k : null;
                            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                            if (clipVideoFile == null) {
                                if (d5 != null) {
                                    list2 = d5.e;
                                    singletonList = list2;
                                    str2 = str;
                                }
                                str2 = str;
                                singletonList = null;
                            } else {
                                List<TrendingHashtag> list4 = clipVideoFile.Q1;
                                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((TrendingHashtag) it.next()).b);
                                }
                                if (d5 == null || (list = d5.e) == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    for (Object obj : list) {
                                        Text text4 = ((Description) obj).b;
                                        if (!j5g.P(arrayList2, text4 != null ? text4.b : null)) {
                                            arrayList.add(obj);
                                        }
                                    }
                                }
                                MusicTrack musicTrack = clipVideoFile.D1;
                                if (musicTrack == null) {
                                    str2 = str;
                                    singletonList = arrayList;
                                } else {
                                    String a = ob50.a(musicTrack);
                                    String str13 = musicTrack.d;
                                    if (a.length() > 0 && str13 != null && str13.length() != 0) {
                                        a = y8g0.f(R.string.on_media_audio_name_template, str13, a);
                                    } else if (a.length() <= 0) {
                                        a = (str13 == null || str13.length() == 0) ? "" : str13;
                                    }
                                    str2 = str;
                                    Description description = new Description(new Text(a, null, 2, null), null, new ActionOpenClipMusicGrid(musicTrack, clipVideoFile.L1), null, a, false, true, musicTrack.X);
                                    if (arrayList != null) {
                                        ArrayList arrayList3 = new ArrayList(arrayList);
                                        Iterator it2 = arrayList3.iterator();
                                        int i2 = 0;
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                i2 = -1;
                                                break;
                                            }
                                            if (((Description) it2.next()).h) {
                                                break;
                                            }
                                            i2++;
                                        }
                                        if (i2 >= 0) {
                                            arrayList3.set(i2, description);
                                        } else {
                                            arrayList3.add(new Description(description.b, description.c, description.d, description.e, description.f, true, description.h, description.i));
                                        }
                                        singletonList = arrayList3;
                                    } else {
                                        singletonList = Collections.singletonList(description);
                                    }
                                }
                            }
                        } else {
                            if (d5 != null) {
                                list2 = d5.e;
                                singletonList = list2;
                                str2 = str;
                            }
                            str2 = str;
                            singletonList = null;
                        }
                        if (d5 != null) {
                            SourcePhoto sourcePhoto2 = d5.b;
                            if (sourcePhoto2 == null || (d4 = sourcePhoto2.d()) == null || (image2 = d4.g) == null) {
                                image2 = sourcePhoto2 != null ? sourcePhoto2.c : null;
                            }
                            int b = cn70.b(32);
                            if (image2 != null) {
                                Serializer.c<Owner> cVar = Owner.CREATOR;
                                str10 = Owner.a.a(b, image2);
                            } else {
                                String str14 = sourcePhoto2 != null ? sourcePhoto2.d : null;
                                if (str14 == null || str14.length() == 0) {
                                    String str15 = (sourcePhoto2 == null || (d3 = sourcePhoto2.d()) == null) ? null : d3.e;
                                    if (str15 != null && str15.length() != 0 && sourcePhoto2 != null && (d2 = sourcePhoto2.d()) != null) {
                                        str10 = d2.e;
                                    }
                                    str10 = null;
                                } else {
                                    if (sourcePhoto2 != null) {
                                        str10 = sourcePhoto2.d;
                                    }
                                    str10 = null;
                                }
                            }
                            str3 = str10;
                        } else {
                            str3 = null;
                        }
                        boolean z18 = r2 instanceof Videos;
                        boolean z19 = (!z18 || ((r2 instanceof ShitAttachment) && di60.H(r2))) && di60.K(r2, s1c0Var);
                        ucp ucpVar = ucp.a;
                        CharSequence charSequence = ucp.i(str2);
                        UserId d6 = headerTitle3 != null ? headerTitle3.d() : null;
                        Integer num = d5 != null ? d5.h : null;
                        if (z) {
                            Post post = (Post) r2;
                            if (post.oc() || post.rc()) {
                                z3 = z17;
                                z4 = true;
                                String str16 = imageStatus == null ? imageStatus.c : null;
                                CharSequence charSequence2 = charSequence;
                                if (imageStatus != null || (image = imageStatus.d) == null) {
                                    str4 = str3;
                                    z5 = z18;
                                    z6 = false;
                                } else {
                                    str4 = str3;
                                    z5 = z18;
                                    z6 = false;
                                    ImageSize Ab = image.Ab(cn70.b(16), false);
                                    if (Ab != null) {
                                        str5 = Ab.d.d;
                                        String str17 = str16;
                                        boolean z20 = imageStatus != null ? true : z6;
                                        if (singletonList != null) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.clear();
                                            boolean z21 = false;
                                            for (Description description2 : singletonList) {
                                                String str18 = str5;
                                                if (z21) {
                                                    str9 = str17;
                                                    spannableStringBuilder.append((CharSequence) " ");
                                                } else {
                                                    str9 = str17;
                                                }
                                                String str19 = description2.f;
                                                Text text5 = description2.b;
                                                if (str19 == null || str19.length() == 0) {
                                                    String str20 = text5 != null ? text5.b : null;
                                                    if (str20 != null && str20.length() != 0) {
                                                        spannableStringBuilder.append((CharSequence) (text5 != null ? text5.b : null));
                                                    }
                                                } else {
                                                    spannableStringBuilder.append((CharSequence) description2.f);
                                                }
                                                str17 = str9;
                                                str5 = str18;
                                                z21 = true;
                                            }
                                            str6 = str5;
                                            str7 = str17;
                                            str8 = spannableStringBuilder.toString();
                                        } else {
                                            str6 = str5;
                                            str7 = str17;
                                            str8 = null;
                                        }
                                        if (singletonList != null) {
                                            List list5 = singletonList;
                                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                Iterator it3 = list5.iterator();
                                                while (it3.hasNext()) {
                                                    if (((Description) it3.next()).g) {
                                                        z7 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        z7 = false;
                                        if (d5 != null) {
                                            if (z || (r2 instanceof PromoPost)) {
                                                HeaderTitle headerTitle4 = d5.c;
                                                if (headerTitle4 != null && (r5 = headerTitle4.d()) != null) {
                                                    z8 = z7;
                                                }
                                            } else {
                                                z8 = z7;
                                            }
                                            z9 = true;
                                            HeaderIcon headerIcon = d5 == null ? d5.j : null;
                                            if (z) {
                                                z10 = z9;
                                                if (r2 instanceof PromoPost) {
                                                    Post post2 = ((PromoPost) r2).n;
                                                    if (s1c0Var != null) {
                                                        if (s1c0Var.o) {
                                                        }
                                                    }
                                                    z11 = false;
                                                } else {
                                                    if (z5) {
                                                        if (s1c0Var != null) {
                                                            if (s1c0Var.D) {
                                                                if (s1c0Var.o) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z11 = false;
                                                }
                                            } else {
                                                if (s1c0Var != null) {
                                                    z10 = z9;
                                                    if (s1c0Var.o) {
                                                    }
                                                } else {
                                                    z10 = z9;
                                                }
                                                z11 = false;
                                            }
                                            if (d5 != null || (sourcePhoto = d5.b) == null || (d = sourcePhoto.d()) == null) {
                                                z12 = z11;
                                            } else {
                                                z12 = z11;
                                                if (d.q) {
                                                    z13 = true;
                                                    boolean z22 = (z13 || z15 || z2) ? false : true;
                                                    VerifyInfo verifyInfo3 = (d5 != null || (headerTitle = d5.c) == null) ? null : headerTitle.e;
                                                    IconSize iconSize = (!F || z3) ? IconSize.DP_16 : D ? IconSize.DP_12 : IconSize.DP_16;
                                                    int i3 = D ? R.string.accessibility_post_header_government_organization_mark : F ? R.string.accessibility_post_header_non_profit_organization_mark : R.string.accessibility_post_header_verify_mark;
                                                    ThemedColor themedColor = (d5 != null || (headerBadge = d5.d) == null || (text = headerBadge.b) == null) ? null : text.c;
                                                    boolean z23 = !(str11 != null || str11.length() == 0);
                                                    boolean K = newsEntry != null ? di60.K(newsEntry, s1c0Var) : false;
                                                    boolean q = newsEntry != null ? sni.q(newsEntry) : false;
                                                    if (newsEntry != null || (r33 = sni.l(newsEntry)) == null) {
                                                        UserId userId = UserId.d;
                                                    }
                                                    return Collections.singletonList(new v3c0(str4, z19, str2, charSequence2, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z23, K, q, userId, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
                                                }
                                            }
                                            z13 = false;
                                            if (z13) {
                                            }
                                            if (d5 != null) {
                                            }
                                            if (F) {
                                            }
                                            if (D) {
                                            }
                                            if (d5 != null) {
                                            }
                                            boolean z232 = !(str11 != null || str11.length() == 0);
                                            if (newsEntry != null) {
                                            }
                                            if (newsEntry != null) {
                                            }
                                            if (newsEntry != null) {
                                            }
                                            UserId userId2 = UserId.d;
                                            return Collections.singletonList(new v3c0(str4, z19, str2, charSequence2, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z232, K, q, userId2, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
                                        }
                                        z8 = z7;
                                        z9 = false;
                                        if (d5 == null) {
                                        }
                                        if (z) {
                                        }
                                        if (d5 != null) {
                                        }
                                        z12 = z11;
                                        z13 = false;
                                        if (z13) {
                                        }
                                        if (d5 != null) {
                                        }
                                        if (F) {
                                        }
                                        if (D) {
                                        }
                                        if (d5 != null) {
                                        }
                                        boolean z2322 = !(str11 != null || str11.length() == 0);
                                        if (newsEntry != null) {
                                        }
                                        if (newsEntry != null) {
                                        }
                                        if (newsEntry != null) {
                                        }
                                        UserId userId22 = UserId.d;
                                        return Collections.singletonList(new v3c0(str4, z19, str2, charSequence2, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z2322, K, q, userId22, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
                                    }
                                }
                                str5 = null;
                                String str172 = str16;
                                if (imageStatus != null) {
                                }
                                if (singletonList != null) {
                                }
                                if (singletonList != null) {
                                }
                                z7 = false;
                                if (d5 != null) {
                                }
                                z8 = z7;
                                z9 = false;
                                if (d5 == null) {
                                }
                                if (z) {
                                }
                                if (d5 != null) {
                                }
                                z12 = z11;
                                z13 = false;
                                if (z13) {
                                }
                                if (d5 != null) {
                                }
                                if (F) {
                                }
                                if (D) {
                                }
                                if (d5 != null) {
                                }
                                boolean z23222 = !(str11 != null || str11.length() == 0);
                                if (newsEntry != null) {
                                }
                                if (newsEntry != null) {
                                }
                                if (newsEntry != null) {
                                }
                                UserId userId222 = UserId.d;
                                return Collections.singletonList(new v3c0(str4, z19, str2, charSequence2, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z23222, K, q, userId222, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
                            }
                        }
                        z3 = z17;
                        z4 = false;
                        if (imageStatus == null) {
                        }
                        CharSequence charSequence22 = charSequence;
                        if (imageStatus != null) {
                        }
                        str4 = str3;
                        z5 = z18;
                        z6 = false;
                        str5 = null;
                        String str1722 = str16;
                        if (imageStatus != null) {
                        }
                        if (singletonList != null) {
                        }
                        if (singletonList != null) {
                        }
                        z7 = false;
                        if (d5 != null) {
                        }
                        z8 = z7;
                        z9 = false;
                        if (d5 == null) {
                        }
                        if (z) {
                        }
                        if (d5 != null) {
                        }
                        z12 = z11;
                        z13 = false;
                        if (z13) {
                        }
                        if (d5 != null) {
                        }
                        if (F) {
                        }
                        if (D) {
                        }
                        if (d5 != null) {
                        }
                        boolean z232222 = !(str11 != null || str11.length() == 0);
                        if (newsEntry != null) {
                        }
                        if (newsEntry != null) {
                        }
                        if (newsEntry != null) {
                        }
                        UserId userId2222 = UserId.d;
                        return Collections.singletonList(new v3c0(str4, z19, str2, charSequence22, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z232222, K, q, userId2222, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
                    }
                }
                z2 = false;
                String str122 = "";
                if (((Boolean) this.c.getValue()).booleanValue()) {
                }
                if (d5 != null) {
                }
                boolean z182 = r2 instanceof Videos;
                if (z182) {
                }
                ucp ucpVar2 = ucp.a;
                CharSequence charSequence3 = ucp.i(str2);
                if (headerTitle3 != null) {
                }
                if (d5 != null) {
                }
                if (z) {
                }
                z3 = z17;
                z4 = false;
                if (imageStatus == null) {
                }
                CharSequence charSequence222 = charSequence3;
                if (imageStatus != null) {
                }
                str4 = str3;
                z5 = z182;
                z6 = false;
                str5 = null;
                String str17222 = str16;
                if (imageStatus != null) {
                }
                if (singletonList != null) {
                }
                if (singletonList != null) {
                }
                z7 = false;
                if (d5 != null) {
                }
                z8 = z7;
                z9 = false;
                if (d5 == null) {
                }
                if (z) {
                }
                if (d5 != null) {
                }
                z12 = z11;
                z13 = false;
                if (z13) {
                }
                if (d5 != null) {
                }
                if (F) {
                }
                if (D) {
                }
                if (d5 != null) {
                }
                boolean z2322222 = !(str11 != null || str11.length() == 0);
                if (newsEntry != null) {
                }
                if (newsEntry != null) {
                }
                if (newsEntry != null) {
                }
                UserId userId22222 = UserId.d;
                return Collections.singletonList(new v3c0(str4, z19, str2, charSequence222, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z2322222, K, q, userId22222, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
            }
        }
        z = z14;
        str = null;
        boolean z162 = r2 instanceof wsx0;
        if (!z162) {
        }
        if (!z162) {
        }
        if (z162) {
        }
        if (headerTitle3 == null) {
        }
        if (d5 != null) {
        }
        if (z) {
        }
        newsEntry = r2;
        if (!z15) {
            R = di60.R(r2);
            if ((R != null || (owner = R.o) == null) ? false : owner.w) {
            }
        }
        z2 = false;
        String str1222 = "";
        if (((Boolean) this.c.getValue()).booleanValue()) {
        }
        if (d5 != null) {
        }
        boolean z1822 = r2 instanceof Videos;
        if (z1822) {
        }
        ucp ucpVar22 = ucp.a;
        CharSequence charSequence32 = ucp.i(str2);
        if (headerTitle3 != null) {
        }
        if (d5 != null) {
        }
        if (z) {
        }
        z3 = z17;
        z4 = false;
        if (imageStatus == null) {
        }
        CharSequence charSequence2222 = charSequence32;
        if (imageStatus != null) {
        }
        str4 = str3;
        z5 = z1822;
        z6 = false;
        str5 = null;
        String str172222 = str16;
        if (imageStatus != null) {
        }
        if (singletonList != null) {
        }
        if (singletonList != null) {
        }
        z7 = false;
        if (d5 != null) {
        }
        z8 = z7;
        z9 = false;
        if (d5 == null) {
        }
        if (z) {
        }
        if (d5 != null) {
        }
        z12 = z11;
        z13 = false;
        if (z13) {
        }
        if (d5 != null) {
        }
        if (F) {
        }
        if (D) {
        }
        if (d5 != null) {
        }
        boolean z23222222 = !(str11 != null || str11.length() == 0);
        if (newsEntry != null) {
        }
        if (newsEntry != null) {
        }
        if (newsEntry != null) {
        }
        UserId userId222222 = UserId.d;
        return Collections.singletonList(new v3c0(str4, z19, str2, charSequence2222, d6, singletonList, str8, num, z4, imageStatus, str7, str6, z20, headerIcon, z10, z12, z15, z22, z8, D, F, verifyInfo3, iconSize, i3, str11, themedColor, z23222222, K, q, userId222222, newsEntry, s1c0Var.s == ActionsMenuType.REDESIGN_AND_DISABLE, z2, r2, newsEntry3));
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.b, ((o1i0) this.c).c.getzenv2("com.vk.push.authsdk"));
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.b, new IllegalStateException("Library loading was failed", th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }

    public q5w(x1o0 x1o0Var) {
        this.b = x1o0Var;
        this.c = new bpn0(new jkg0(10));
    }

    public q5w() {
        u3c0 u3c0Var = new u3c0(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, u3c0Var);
        this.c = msy.a(lazyThreadSafetyMode, new c2c0(1));
    }
}
