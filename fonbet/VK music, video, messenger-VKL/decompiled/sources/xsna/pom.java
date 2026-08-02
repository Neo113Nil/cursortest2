package xsna;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.log.L;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pom implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pom(long j, ohm ohmVar, hpm hpmVar) {
        this.d = hpmVar;
        this.e = ohmVar;
        this.c = j;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v22, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r25v24, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v27 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1, types: [com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto] */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1, types: [com.vk.newsfeed.posting.impl.presentation.model.FileDto] */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1, types: [com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.vk.newsfeed.posting.impl.presentation.model.ActionButton] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r48v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        kec0 kec0Var;
        PhotoVideoDisplayMode photoVideoDisplayMode;
        ArrayList arrayList;
        PostingPlaceDto postingPlaceDto;
        PostingArticleDto postingArticleDto;
        String str;
        SnippetAttachment snippetAttachment;
        ?? postingLinkDto;
        int i = this.b;
        Object obj2 = this.e;
        long j = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ohm ohmVar = (ohm) obj2;
                SQLiteStatement g = ((hpm) obj3).b.b().g("\n            REPLACE INTO dialog_members (\n                dialog_id,\n                member_type, member_id, invited_by_type, invited_by_id,\n                join_date, is_admin, can_kick, is_request, \n                incognito_id, incognito_name, is_restricted_to_write\n            )\n            VALUES (?,?,?,?,?,?,?,?,?,?,?,?)\n            ");
                try {
                    ListIterator listIterator = ohmVar.b.listIterator();
                    while (listIterator.hasNext()) {
                        DialogMember dialogMember = (DialogMember) listIterator.next();
                        g.bindLong(1, j);
                        Peer peer = dialogMember.b;
                        Peer peer2 = dialogMember.c;
                        g.bindLong(2, peer.c.h());
                        g.bindLong(3, dialogMember.b.d);
                        g.bindLong(4, peer2.c.h());
                        g.bindLong(5, peer2.d);
                        g.bindLong(6, dialogMember.d);
                        rdi.i(g, 7, dialogMember.h);
                        rdi.i(g, 8, dialogMember.i);
                        rdi.i(g, 9, dialogMember.e);
                        rdi.k(g, 10, dialogMember.f);
                        rdi.m(g, 11, dialogMember.g);
                        rdi.i(g, 12, dialogMember.j);
                        g.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(g, th);
                        throw th2;
                    }
                }
            default:
                UserId userId = (UserId) obj3;
                pec0 pec0Var = (pec0) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM posting_draft WHERE user_id = ? AND id = ?");
                try {
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, j);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "user_id");
                    int k3 = egi.k(V0, "text");
                    int k4 = egi.k(V0, "privacy_settings_type");
                    int k5 = egi.k(V0, "display_mode");
                    int k6 = egi.k(V0, "crop_data");
                    int k7 = egi.k(V0, "coauthors");
                    int k8 = egi.k(V0, "postpone_publish_date");
                    int k9 = egi.k(V0, "poll");
                    int k10 = egi.k(V0, "place");
                    int k11 = egi.k(V0, "article");
                    int k12 = egi.k(V0, "link");
                    int k13 = egi.k(V0, "music");
                    int k14 = egi.k(V0, X3.i.b);
                    int k15 = egi.k(V0, "attachments");
                    int k16 = egi.k(V0, "photo_tags");
                    int k17 = egi.k(V0, "settings");
                    int k18 = egi.k(V0, "actionButton");
                    int k19 = egi.k(V0, "rememberActionButton");
                    int k20 = egi.k(V0, "open_for_all_date");
                    int k21 = egi.k(V0, "donutTeaserText");
                    if (V0.step()) {
                        long j2 = V0.getLong(k);
                        UserId userId2 = new UserId(V0.getLong(k2));
                        String l2 = V0.l2(k3);
                        PrivacyPostType d = fpc0.d(V0.l2(k4));
                        String l22 = V0.l2(k5);
                        pec0Var.getClass();
                        if (epx.f(l22, "Grid")) {
                            photoVideoDisplayMode = PhotoVideoDisplayMode.Grid;
                        } else {
                            if (!epx.f(l22, "Carousel")) {
                                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + l22);
                            }
                            photoVideoDisplayMode = PhotoVideoDisplayMode.Carousel;
                        }
                        PhotoVideoDisplayMode photoVideoDisplayMode2 = photoVideoDisplayMode;
                        PhotoVideoAttachmentsCropData c = fpc0.c(V0.l2(k6));
                        String l23 = V0.isNull(k7) ? null : V0.l2(k7);
                        if (l23 == null) {
                            arrayList = null;
                        } else {
                            JSONArray i2 = cqm0.i(l23);
                            ArrayList arrayList2 = new ArrayList(i2.length());
                            int length = i2.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                JSONObject jSONObject = i2.getJSONObject(i3);
                                Serializer.c<Owner> cVar = Owner.CREATOR;
                                arrayList2.add(new CoauthorDto(Owner.a.c(jSONObject)));
                            }
                            arrayList = arrayList2;
                        }
                        Long valueOf = V0.isNull(k8) ? null : Long.valueOf(V0.getLong(k8));
                        Date date = valueOf != null ? new Date(valueOf.longValue()) : null;
                        String l24 = V0.isNull(k9) ? null : V0.l2(k9);
                        PostingPollDto f = l24 == null ? null : rcc0.f(l24);
                        String l25 = V0.isNull(k10) ? null : V0.l2(k10);
                        if (l25 == null) {
                            postingPlaceDto = null;
                        } else {
                            JSONObject jSONObject2 = new JSONObject(l25);
                            postingPlaceDto = new PostingPlaceDto(jSONObject2.getInt("id"), jSONObject2.getString("title"), f370.D(jSONObject2, "place_address"), f370.D(jSONObject2, "place_category"));
                        }
                        String l26 = V0.isNull(k11) ? null : V0.l2(k11);
                        if (l26 == null) {
                            postingArticleDto = null;
                        } else {
                            JSONObject jSONObject3 = new JSONObject(l26);
                            String optString = jSONObject3.has("source_url") ? jSONObject3.optString("source_url") : null;
                            Serializer.c<ArticleAttachment> cVar2 = ArticleAttachment.CREATOR;
                            JSONObject optJSONObject = jSONObject3.optJSONObject("article");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("owner");
                            Serializer.c<Owner> cVar3 = Owner.CREATOR;
                            postingArticleDto = new PostingArticleDto(new ArticleAttachment(vj90.a(optJSONObject, Owner.a.c(optJSONObject2))), optString);
                        }
                        String l27 = V0.isNull(k12) ? null : V0.l2(k12);
                        if (l27 == null) {
                            str = null;
                            postingLinkDto = 0;
                        } else {
                            JSONObject jSONObject4 = new JSONObject(l27);
                            char[] cArr = SnippetAttachment.H;
                            JSONObject optJSONObject3 = jSONObject4.optJSONObject("snippet");
                            if (optJSONObject3 == null) {
                                snippetAttachment = null;
                                str = null;
                            } else {
                                str = null;
                                try {
                                    snippetAttachment = SnippetAttachment.Ib(optJSONObject3, null);
                                } catch (JSONException e) {
                                    L.i(e);
                                    snippetAttachment = null;
                                }
                            }
                            postingLinkDto = snippetAttachment == null ? str : new PostingLinkDto(snippetAttachment, jSONObject4.has("source_url") ? jSONObject4.optString("source_url") : str);
                        }
                        String l28 = V0.isNull(k13) ? str : V0.l2(k13);
                        ?? d2 = l28 == null ? str : rcc0.d(l28);
                        String l29 = V0.isNull(k14) ? str : V0.l2(k14);
                        ?? c2 = l29 == null ? str : rcc0.c(l29);
                        ArrayList e2 = rcc0.e(V0.l2(k15));
                        String l210 = V0.isNull(k16) ? str : V0.l2(k16);
                        ?? b = l210 == null ? str : fpc0.b(l210);
                        String l211 = V0.isNull(k17) ? str : V0.l2(k17);
                        ?? a = l211 == null ? str : fpc0.a(l211);
                        String l212 = V0.isNull(k18) ? str : V0.l2(k18);
                        ?? b2 = l212 == null ? str : rcc0.b(l212);
                        ?? valueOf2 = V0.isNull(k19) ? str : Integer.valueOf((int) V0.getLong(k19));
                        ?? valueOf3 = valueOf2 != 0 ? Boolean.valueOf(valueOf2.intValue() != 0) : str;
                        ?? valueOf4 = V0.isNull(k20) ? str : Long.valueOf(V0.getLong(k20));
                        kec0Var = new kec0(j2, userId2, l2, d, photoVideoDisplayMode2, c, arrayList, date, f, postingPlaceDto, postingArticleDto, postingLinkDto, d2, c2, e2, b, a, b2, valueOf3, valueOf4 != 0 ? new Date(valueOf4.longValue()) : str, V0.isNull(k21) ? str : V0.l2(k21));
                    } else {
                        kec0Var = null;
                    }
                    V0.close();
                    return kec0Var;
                } finally {
                    V0.close();
                }
        }
    }

    public /* synthetic */ pom(UserId userId, long j, pec0 pec0Var) {
        this.d = userId;
        this.c = j;
        this.e = pec0Var;
    }
}
